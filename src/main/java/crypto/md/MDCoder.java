package crypto.md;

import org.junit.Assert;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 *
 * 不论是哪一种MD算法，它们都需要获得一个随机长度的信息并产生一个128位的信息摘要
 * 然后将这个128位的二进制摘要信息换算成十六进制
 * 可以得到一个32位（每4位二进制数转换为1位十六进制数）的字符串
 * Created by gongchunru on 2017/3/16.
 */
public class MDCoder {

    public static byte[] encodeMD2(byte[] data) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD2");

        return md.digest(data);
    }

    public static byte[] encodeMD5(byte[] data) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");

        return md.digest(data);
    }


    public static void main(String[] args)throws Exception {
        String str = "这是一行信息";

        String[] a = {"2","3"};
        String[] b = {"2","3"};
        System.out.println(a.equals(b));

        String c = "1";
        String d = "1";
        System.out.println(c.equals(d));



        byte[] data1 =  encodeMD2(str.getBytes());
        byte[] data2 = encodeMD2(str.getBytes());
        System.out.println(Arrays.toString(data1));
        System.out.println(data1 == data2);

        System.out.println("=====md5====");

        byte[] data3 = encodeMD5(str.getBytes());
        byte[] data4 = encodeMD5(str.getBytes());

        Assert.assertArrayEquals(data1,data2);
        Assert.assertArrayEquals(data3,data4);
        System.out.println("========");

    }
}
