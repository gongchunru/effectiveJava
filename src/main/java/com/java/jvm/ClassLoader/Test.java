package com.java.jvm.ClassLoader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by gongchunru
 * Date：2017/7/1.
 * Time：16:04
 */
public class Test {

    public static void main(String[] args) {
//        Map<String, Object> a = new HashMap<String, Object>(4);
//        a.put("1", "2");
//        a.put("1", "2");
////        a.put("3", "2");
////        a.put("4", "2");
////        a.put("5", "2");
//        System.out.println(a.size());

//


//        List<String> planList = new ArrayList(4);
//
//        planList.add("1");
//        planList.add("2");
//        planList.add("3");
//        planList.add("4");
//        planList.add("5");
//
//        System.out.println(planList.size());


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse("2017-07-01");
            System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new Date().getTime());

        System.out.println(new Date());


    }
}
