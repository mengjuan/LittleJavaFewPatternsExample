package shape;

import java.awt.*;

/**
 * Created by super on 2018/12/4.
 */
public interface ShapeVisitorI {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTrans(Point p, Shape s);
}
