package guava.ch2.splitter;

import java.util.Arrays;

/**
 * Created by gongchunru
 * Date：2017/4/21.
 * Time：14:42
 */
public class StringSplitExample {
    public static void main(String[] args) {
        String commaSeparatedString  = "Foo,,Bar,,Baz,,,";
        String[] words = commaSeparatedString.split(",");
        System.out.println(Arrays.toString(words));
    }
}
