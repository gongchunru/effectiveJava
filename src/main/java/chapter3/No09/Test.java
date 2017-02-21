package chapter3.No09;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gongchunru on 2017/2/17.
 */
public class Test {
    public static void main(String[] args) {
        Map<PhoneNumber,String> m = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707,867,2323),"Jenny");

        //如果按照下面的方法去获取，必须覆盖hashcode方法才可以获取到
        System.out.println(m.get(new PhoneNumber(707,867,2323)));
    }
}
