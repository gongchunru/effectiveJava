package java8.lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * lambda的几种形式（变体）
 * Created by gongchunru on 2017/4/6.
 */
public class Lambdas{

    public static void main(String[] args) {

        // 没有参数， 返回类型是void
        Runnable noArguments = () -> System.out.println("hello world");

        //包含一个参数，可以省略括号，参数不用指定类型
        ActionListener oneArguments =  event -> System.out.println("hello world");

        //lambda表达式可以是一段代码块。
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" world");
        };

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;





    }
}
