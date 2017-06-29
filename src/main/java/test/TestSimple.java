package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gongchunru on 2016/9/19.
 */
public class TestSimple {
    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("hello", "a");
//        map.put("world", "b");
//
//        for (Map.Entry<String,Object> entry:map.entrySet()){
//            System.out.println(entry.getKey()+", "+ entry.getValue());
//        }
//
//        Set<String> strings = map.keySet();


        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("1","a");
        map.put("2","b");


        System.out.println(map.get("1").toString());

        map.putIfAbsent("1","b");
        map.put("3","c");


        System.out.println(map.get("1").toString());
        map.put("1","d");
        System.out.println(map.get("1").toString());


        System.out.println(map.get("3").toString());
    }
}
