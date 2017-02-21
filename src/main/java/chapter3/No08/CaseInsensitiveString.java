package chapter3.No08;

/**
 * Created by gongchunru on 2017/2/17.
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s){
        if (s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof CaseInsensitiveString){
//            return s.equalsIgnoreCase(((CaseInsensitiveString)obj).s);
//        }
//        if (obj instanceof String){
//            return s.equalsIgnoreCase((String)obj);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
    }
}
