package effectiveJava.chapter6.item30;

/**
 * Created by gongchunru on 2017/2/21.
 */
public enum Operation {
    PLUS("+") {
        double apply(double x, double y) {return x + y;}
    },
    MINUS("-") {
        double apply(double x, double y) { return x - y;}
    },
    TIMES("*") {
        double apply(double x, double y) { return x * y;}
    },
    DIVIDE("/") {
        double apply(double x, double y) {return x / y;}
    };
    private final String symbol;

    Operation(String symbol) {this.symbol = symbol;}
    @Override
    public String toString() {
        return symbol;
    }
    abstract double apply(double x, double y);
}
