package test;


import javax.xml.ws.Holder;

/**
 * @author gongchunru
 * Date：2017/11/23.
 * Time：13:34
 */
public class Demo1 {

    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(11);
        //1 , 11
        System.out.println("a: "+a+",b:"+b);


        add(a,b);
        //1, 11
        System.out.println("a: "+a+",b:"+b);

        add2(a,b);
        // 1, 11
        System.out.println("a: "+a+",b:"+b);

        Holder<Integer> holder = new Holder<Integer>(b);
        add3(a, holder);
        //
        System.out.println("a: "+a+",b:"+holder.value);
    }


    public static void  add(int aa ,Integer bb){
        aa = 2;
        bb = 22;
    }

    public static void  add2(int aa ,Integer bb){
        aa = new  Integer(2);
        bb = new Integer(22);
    }
    public static void  add3(int aa , Holder<Integer> bb){
        aa = 2;
        bb.value = new Integer(22);
    }

}
