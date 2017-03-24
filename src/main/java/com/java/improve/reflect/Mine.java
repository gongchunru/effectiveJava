package com.java.improve.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by gongchunru on 2017/3/21.
 */
public class Mine {
    public static void main(String[] args) throws IOException {
        String[] requesUrlArr = {"javarise.com/home", "javarise.com/mine"};
        File configFile = new File("src/main/java/com/java/improve/reflect/MyConfig.properties");
        Properties configProperties = new Properties();

        FileInputStream fileInputStream = new FileInputStream(configFile);

        configProperties.load(fileInputStream);

        System.out.println(configProperties);

        for (String url: requesUrlArr) {
            String className = configProperties.getProperty(url);

            try {
                //反射根据类名生成对应的类
                Class clazz = Class.forName(className);

                //根据类生成对应的实例
                RequestHandlerInterface requestHandler = (RequestHandlerInterface) clazz.newInstance();

                //根据类生成对应的实例
                String request = requestHandler.handleReqeust(url);

                System.out.println(request);

            } catch (InstantiationException e){
                e.printStackTrace();
            }catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
