package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gongchunru on 2016/9/19.
 */
public class TestSimple {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("hello", "a");
        map.put("world", "b");

        for (Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+", "+ entry.getValue());
        }

        Set<String> strings = map.keySet();

    }
}
