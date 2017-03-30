package effectiveJava.chapter6.item32;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author gongchunru
 * @Package effectiveJava.chapter6.item32
 * @date 2017/3/30 00:06
 */
public class Text {

    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles){}

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }

}
