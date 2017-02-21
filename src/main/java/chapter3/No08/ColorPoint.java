package chapter3.No08;

import java.awt.*;

/**
 * Created by gongchunru on 2017/2/17.
 */
public class ColorPoint extends Point {

    private Color color;

    public ColorPoint(int x, int y,Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  ColorPoint))
            return false;
        return super.equals(obj) && ((ColorPoint)obj).color == color;
    }
}
