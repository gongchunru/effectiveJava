package chapter3.No09;

/**
 * Created by gongchunru on 2017/2/17.
 */
public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;


    public PhoneNumber(int areaCode, int  prefix, int lineNumber) {

        rangeCheck(areaCode,999,"are code");
        rangeCheck(prefix,999,"prefix");
        rangeCheck(lineNumber,9999,"lineNumber");

        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private static void rangeCheck(int arg,int max,String name){
        if (arg < 0 || arg > max){
            throw new IllegalArgumentException(name+": "+arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (!(obj instanceof PhoneNumber)){
            return false;
        }

        PhoneNumber pn = (PhoneNumber)obj;

        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }
}
