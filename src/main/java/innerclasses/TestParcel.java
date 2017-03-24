package innerclasses;

/**
 * @author gongchunru
 * @Package com.java.innerclasses
 * @date 16/6/27 15:35
 */

class Parcel4{
    private class PContents implements  Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        public PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmaina");
        //这里访问不到pc
//        Parcel4.PContents pc = p.new PContents();
    }
}