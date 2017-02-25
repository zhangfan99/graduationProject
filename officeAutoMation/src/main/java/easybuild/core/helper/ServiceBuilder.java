package easybuild.core.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by zhangfan on 2017/1/7.
 */
public class ServiceBuilder {

    private static final String SERVICE_IMPORT_POJO = "import com.office.automation.modules.pojo.%s.%s;\n";

    private String pojoName;
    private String serviceName;
    private String serviceImplName;

    public static final String SERVICE = "Service";

    public ServiceBuilder(String moduleName){
        this.pojoName = CoreBuilderUtils.getPojoName(moduleName);
        this.serviceName = this.pojoName + SERVICE;
        this.serviceImplName = this.serviceName + CoreBuilderUtils.IMPL_SUFFIX;
    }

    private static final String SERVICE_INTERFACE_IMPORT =
            "import com.office.automation.bases.service.StringPojoBaseService;";
    private static final String SERVICE_INTERFACE_BODY =
            "public interface %s extends StringPojoBaseService<%s>{\n\n}";

    public void createService(String moduleName, File project) throws Exception {
        File dir = new File(project.getAbsolutePath() + CoreBuilderUtils.FILE_PREFIX + "service\\" + moduleName);
        if (!dir.exists()){
            dir.mkdir();
        }

        String servicePath = dir.getAbsolutePath() + "/" + this.serviceName + CoreBuilderUtils.FILE_SUFFIX;
        File Service = new File(servicePath);
        if (!Service.exists() && Service.createNewFile()){
            FileOutputStream fs = new FileOutputStream(Service);
            PrintStream p = new PrintStream(fs);
            p.println(CoreBuilderUtils.CLASS_PREFIX + "service."+ moduleName + ";");
            p.println();
            p.println(SERVICE_INTERFACE_IMPORT);
            p.printf(SERVICE_IMPORT_POJO, moduleName, pojoName);
            p.println();
            p.printf(CoreBuilderUtils.CLASS_BUILDER, CoreBuilderUtils.hostName, CoreBuilderUtils.date);
            p.printf(SERVICE_INTERFACE_BODY, this.serviceName, this.pojoName);
            p.close();
        }else {
            throw new Exception("类已存在");
        }
        createServiceImpl(moduleName, dir);
    }

    private static final String SERVICE_IMPLEMENTS_IMPORT =
            "import com.office.automation.bases.service.StringPojoBaseServiceImpl;";
    private static final String SERVICE_IMPLEMENTS_IMPORT_DAO =
            "import com.office.automation.modules.dao.%s.%sMapper;";
    private static final String SERVICE_IMPLEMENTS_IMPORT_APPBASEDAO =
            "import com.office.automation.bases.dao.BaseDao;";
    private static final String SERVICE_IMPLEMENTS_IMPORT_AUTOWIRED =
            "import org.springframework.beans.factory.annotation.Autowired;\n";
    private static final String SERVICE_IMPLEMENTS_IMPORT_ANNOTATION =
            "import org.springframework.stereotype.Service;";
    private static final String SERVICE_IMPLEMENTS_BODY =
            "@Service\npublic class %s extends StringPojoBaseServiceImpl<%s>\n        implements %s {\n" +
                    "    private %s %s;\n" +
                    "\n" +
                    "    @Autowired\n" +
                    "    public void set%s(%s %s) {\n" +
                    "        this.%s = %s;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected BaseDao<%s, String> getDao() {\n" +
                    "        return %s;\n" +
                    "    }\n" +
                    "}";

    public void createServiceImpl(String moduleName, File dir) throws Exception{
        String serviceImplPath = dir.getAbsolutePath() + "/" + this.serviceImplName + CoreBuilderUtils.FILE_SUFFIX;
        File serviceImplFile = new File(serviceImplPath);
        if (serviceImplFile.createNewFile()){
            FileOutputStream fs = new FileOutputStream(serviceImplFile);
            PrintStream p = new PrintStream(fs);
            p.println(CoreBuilderUtils.CLASS_PREFIX + "service." + moduleName + ";");
            p.println();
            p.println(SERVICE_IMPLEMENTS_IMPORT);
            p.println(SERVICE_IMPLEMENTS_IMPORT_APPBASEDAO);
            p.println(SERVICE_IMPLEMENTS_IMPORT_AUTOWIRED);
            p.println(SERVICE_IMPLEMENTS_IMPORT_ANNOTATION);
            p.printf(SERVICE_IMPORT_POJO, moduleName, pojoName);
            p.printf(SERVICE_IMPLEMENTS_IMPORT_DAO, moduleName, pojoName);
            p.println();
            p.printf(CoreBuilderUtils.CLASS_BUILDER, CoreBuilderUtils.hostName, CoreBuilderUtils.date);
            String dao = this.pojoName + "Mapper";
            String daoName = moduleName + "Mapper";
            p.printf(SERVICE_IMPLEMENTS_BODY, this.serviceImplName, this.pojoName, this.serviceName,
                    dao, daoName, dao, dao, daoName, daoName, daoName, this.pojoName, daoName);
            p.close();
        }else {
            throw new Exception("类已存在");
        }
    }
}
