package effectiveJava.chapter6.item30;

/**
 * Created by gongchunru on 2017/2/21.
 */
public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p: Planet.values()) {
            System.out.printf("Weight on %s is %f%n",p,p.surfaceWeight(mass));
        }
    }
}
