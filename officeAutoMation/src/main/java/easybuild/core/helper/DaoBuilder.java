package easybuild.core.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by zhangfan on 2017/1/9.
 */
public class DaoBuilder {

    private static final String IMPORT_POJO = "import com.office.automation.modules.pojo.%s.%s;\n";

    public static final String DAO = "Mapper";

    private String pojoName;
    private String moduleDaoName;
    private String moduleDaoImplName;

    public DaoBuilder(String moduleName) {
        pojoName = CoreBuilderUtils.getPojoName(moduleName);
        moduleDaoName = pojoName + DAO;
        moduleDaoImplName = moduleDaoName + CoreBuilderUtils.IMPL_SUFFIX;
    }

    private static final String DAO_INTERFACE_IMPORT =
            "import com.office.automation.bases.dao.StringPojoBaseDao;";
    private static final String DAO_INTERFACE_BODY =
            "public interface %s extends StringPojoBaseDao<%s> {\n\n}";


    public void createDao(String moduleName, File project) throws Exception{
        File dir = new File(project.getAbsolutePath() + CoreBuilderUtils.FILE_PREFIX + "dao\\" + moduleName);
        if (dir.exists()){
            dir.delete();
        }
        dir.mkdir();
        String daoPath = dir.getAbsolutePath() + "/" + moduleDaoName + CoreBuilderUtils.FILE_SUFFIX;
        File dao = new File(daoPath);
        if (dao.createNewFile()){
            FileOutputStream fs = new FileOutputStream(dao);
            PrintStream p = new PrintStream(fs);
            p.println(CoreBuilderUtils.CLASS_PREFIX + "dao." + moduleName + ";");
            p.println();
            p.println(DAO_INTERFACE_IMPORT);
            p.printf(IMPORT_POJO, moduleName, pojoName);
            p.println();
            p.printf(CoreBuilderUtils.CLASS_BUILDER, CoreBuilderUtils.hostName, CoreBuilderUtils.date);
            p.printf(DAO_INTERFACE_BODY, moduleDaoName, pojoName);
            p.close();
        }else {
            throw new Exception("类已存在");
        }
        createMapper(moduleName, dir);
//        createDaoImpl(moduleName, dir);
    }



    private static final String DAO_IMPLEMENTS_IMPORT =
            "import net.sinedu.company.bases.dao.BaseDaoImpl;\n";
    private static final String DAO_IMPLEMENTS_IMPORT_ANNOTATION =
            "import org.springframework.stereotype.Repository;\n";
    private static final String DAO_IMPLEMENTS_BODY =
            "@Repository\npublic class %s extends BaseDaoImpl<%s>\n        implements %s {\n" +
            "    private static final String TABLE_NAME = \"t_\";\n" +
            "\n" +
            "    @Override\n" +
            "    protected String getTableName() {\n" +
            "        return TABLE_NAME;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected Class<%s> getPojoClass() {\n" +
            "        return %s.class;\n" +
            "    }\n" +
            "}";

    public void createDaoImpl(String moduleName, File dir) throws Exception{
        String daoImplPath = dir.getAbsolutePath() + "/" + moduleDaoImplName + CoreBuilderUtils.FILE_SUFFIX;
        File daoImplDao = new File(daoImplPath);
        if (daoImplDao.createNewFile()){
            FileOutputStream fs = new FileOutputStream(daoImplDao);
            PrintStream p = new PrintStream(fs);
            p.println(CoreBuilderUtils.CLASS_PREFIX + moduleName + ".dao;");
            p.println();
            p.println(DAO_IMPLEMENTS_IMPORT);
            p.printf(IMPORT_POJO, moduleName, pojoName);
            p.println(DAO_IMPLEMENTS_IMPORT_ANNOTATION);
            p.println();
            p.printf(CoreBuilderUtils.CLASS_BUILDER, CoreBuilderUtils.hostName, CoreBuilderUtils.date);
            p.printf(DAO_IMPLEMENTS_BODY, moduleDaoImplName, pojoName, moduleDaoName, pojoName, pojoName);
            p.close();
        }else {
            throw new Exception("类已存在");
        }
    }


    private static final String MAPPER_PREFIX = "/";
    private static final String MAPPER_SUFIX = "Mapper.xml";
    private static final String MAPPER_BODY =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                    "<!DOCTYPE mapper\n" +
                    "        PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"\n" +
                    "        \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n" +
                    "\n" +
                    "<mapper namespace=\"com.office.automation.modules.dao.%s.%sMapper\">\n" +
                    "\n" +
                    "    <sql id=\"tableName\"></sql>\n" +
                    "\n" +
                    "</mapper>";

    private static void createMapper(String moduleName, File dir) throws Exception{
        String pojoName = CoreBuilderUtils.getPojoName(moduleName);

        String mapperPath = dir.getAbsolutePath() + MAPPER_PREFIX + pojoName + MAPPER_SUFIX;
        File mapper = new File(mapperPath);
        if (mapper.createNewFile()) {
            FileOutputStream fs = new FileOutputStream(mapper);
            PrintStream p = new PrintStream(fs);
            p.printf(MAPPER_BODY, moduleName, pojoName);
        }
    }
}
