package easybuild.core.helper;

import easybuild.core.helper.ServiceBuilder;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangfan on 2017/1/6.
 */
public class CoreBuilderUtils {

    public static final String FILE_PREFIX = "\\src\\main\\java\\com\\office\\automation\\modules\\";
    public static final String FILE_SUFFIX = ".java";

    public static final String CLASS_PREFIX = "package com.office.automation.modules.";
    public static final String CLASS_BUILDER = "/**\n * Created by %s on %s .\n\0*/\n";

    public static final String IMPL_SUFFIX = "Impl";

    public static String hostName;
    public static String date;

    private static String moduleName;

    public static void main(String[] args){
        createModule("announcement");
        createModule("department");
        createModule("massage");
        createModule("meet");
        createModule("member");
        createModule("menu");
        createModule("position");
    }


    public static void createModule(String moduleName){
        File project = new File("D:\\IdeaWorkSpace\\graduationProject\\officeAutoMation");//设定为当前文件夹
        try{
            if (project.exists()){
                setComputerInfo();
//                PojoBuilder.createPojo(moduleName, project);
                ServiceBuilder sb = new ServiceBuilder(moduleName);
                sb.createService(moduleName, project);
                DaoBuilder db = new DaoBuilder(moduleName);
                db.createDao(moduleName, project);
            }
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        System.out.println("Build success!");
    }

    private static void setComputerInfo() {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
            hostName = addr.getHostName(); //获取本机计算机名称
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        date = sdf.format(new Date());
    }

    public static String getPojoName(String moduleName){
        return moduleName.replaceFirst(moduleName.substring(0, 1),moduleName.substring(0, 1).toUpperCase());
    }

}
