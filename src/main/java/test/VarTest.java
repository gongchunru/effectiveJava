package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/2 16:39
 */
public class VarTest {

    private int a ;

    public static void main(String[] args) {
        VarTest varTest = new VarTest();
        List<VarTest> list = new ArrayList<>();
        list.add(1,varTest);

        System.out.println(list.toString());

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
