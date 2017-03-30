package effectiveJava.chapter6.item30;

/**
 * Created by gongchunru on 2017/2/21.
 */
public class Test {
    public static void main(String[] args) {
        double x = Double.parseDouble("2");
        double y = Double.parseDouble("4");

        for (Operation op : Operation.values()){
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }
    }
}
