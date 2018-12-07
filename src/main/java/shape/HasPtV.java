package shape;

import java.awt.*;
import java.awt.Shape;

/**
 * Created by super on 2018/12/4.
 */
public class HasPtV implements ShapeVisitorI {
    public boolean forCircle(int r) {
        return false;
    }

    public boolean forSquare(int s) {
        return false;
    }

    public boolean forTrans(Point p, shape.Shape s) {
        return false;
    }

}
