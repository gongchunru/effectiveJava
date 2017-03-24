package other;

/**
 * Created by gongchunru on 2017/2/22.
 */
public class SwapDemo {
    public static void main(String[] args) {

        Integer a = 10, b = 20;
        System.out.println("before a=" + a + ",b=" + b);
        swap(a, b);
        System.out.println("after a=" + a + ",b=" + b);

        init();


    }

    private static void init() {
        Integer c = 20;
        System.out.println("c=" + c);
    }

    private static void swap(Integer i1, Integer i2) {
//        try {
//            Field f = Integer.class.getDeclaredField("value");
//            f.setAccessible(true);
//            Integer temp = new Integer(i1);
//            f.set(i1, i2.intValue());
//            f.set(i2, temp);
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
    }

}
