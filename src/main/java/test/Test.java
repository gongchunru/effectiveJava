package test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/2 16:07
 */
public class Test {

    private static final VarTest VAR_TEST = new VarTest();

    public static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger();

    public static void main(String[] args) {

        ATOMIC_INTEGER.getAndIncrement();
        System.out.println(ATOMIC_INTEGER.get());

    }

}
