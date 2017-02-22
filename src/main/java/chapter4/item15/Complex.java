package chapter4.item15;

/**
 * @author gongchunru
 * @Package chapter4.item15
 * @date 2017/2/22 23:36
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double im, double re) {
        this.im = im;
        this.re = re;
    }

    //可以使用静态工厂来代替构造器(item1)
    public static Complex valueOf(double re,double im){
        return new Complex(re,im);
    }

    public Complex add(Complex c){
        return new Complex(re+c.re,im+c.im);
    }

    public Complex subtract(Complex c){
        return new Complex(re-c.re,im-c.im);
    }

    public Complex multiply(Complex c){
        return new Complex(re * c.re - im * c.im,im * c.re - re * c.im);
    }

    public Complex divide(Complex c){
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im)/tmp,im * c.re - re * c.im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complex complex = (Complex) o;

        if (Double.compare(complex.re, re) != 0) return false;
        return Double.compare(complex.im, im) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private int hashDouble(double val){
        long longBits = Double.doubleToLongBits(re);
        return (int)(longBits ^ (longBits >>> 32));
    }

    @Override
    public String toString() {
        return "Complex{" +
                "im=" + im +
                ", re=" + re +
                '}';
    }
}
