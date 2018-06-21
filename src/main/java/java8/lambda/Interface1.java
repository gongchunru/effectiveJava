package java8.lambda;


import java.text.Format;

public class Interface1 {

    interface Formula{
        double calculate(int a);

        default double sqrt(int a){
            return Math.sqrt(a);
        }

        static int positive(int a){
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };


        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(-23));
        System.out.println(Formula.positive(-4));





        Formula formula2 = (a) -> ( a * 100);
//        formula2.sqrt(100);
        System.out.println(formula2.sqrt(100));
    }




}
