package effectiveJava.chapter4.item16;

import java.util.Arrays;

/**
 * Created by gongchunru on 2017/2/28.
 */
public class Test {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap","Crakle","Bob"));
        System.out.println(s.getAddCount());
    }


}
