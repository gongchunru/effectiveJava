package guava.collect;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gongchunru on 2017/4/5.
 */
public class JoinerTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//        list.add(null);
//        list.add("4");

        String a = "";

        for (int i = 0; i < 5; i++) {
           a  += i+ ",";
        }

        System.out.println(a.toString());

        String[] b = a.split(",");

        Arrays.asList(b);
    }

    public static String joinByGuava(List stringList, String delimiter){
        return Joiner.on(delimiter).skipNulls().join(stringList);
    }


}
