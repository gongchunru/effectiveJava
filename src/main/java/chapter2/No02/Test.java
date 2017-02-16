package chapter2.No02;

/**
 * Created by gongchunru on 2017/2/16.
 */
public class Test {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,80).calories(100).sodium(35).carbohydrate(27).build();
    }
}
