package easybuild.core.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by zhangfan on 2017/1/7.
 */
public class PojoBuilder {
    private static final String POJO_IMPORT = "import com.office.automation.bases.pojo.StringPojo;";
    private static final String POJO_BODY = "public class %s extends StringPojo { \n\n}";

    public static void createPojo(String moduleName, File project) throws Exception{

        String modulePath = project.getAbsolutePath() + CoreBuilderUtils.FILE_PREFIX  + "pojo\\" + moduleName;
        File dir = new File(modulePath);
        if (!dir.exists()){
            dir.mkdir();
        }
        String pojoName = CoreBuilderUtils.getPojoName(moduleName);
        String pojoPath = dir.getAbsolutePath() + "/" + pojoName + CoreBuilderUtils.FILE_SUFFIX;
        File pojo = new File(pojoPath);

        if (!pojo.exists() && pojo.createNewFile()){
            FileOutputStream fs = new FileOutputStream(pojo);
            PrintStream p = new PrintStream(fs);
            p.println(CoreBuilderUtils.CLASS_PREFIX + "pojo." + moduleName + ";");
            p.println();
            p.println(POJO_IMPORT);
            p.println();
            p.printf(CoreBuilderUtils.CLASS_BUILDER, CoreBuilderUtils.hostName, CoreBuilderUtils.date);
            p.printf(POJO_BODY, pojoName);
            p.close();

        }else {
            throw new Exception("类已存在");
        }
    }


}
