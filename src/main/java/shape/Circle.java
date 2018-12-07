package shape;

/**
 * Created by super on 2018/12/4.
 */
public class Circle extends Shape{
    int r;
    Circle(int _r){
        r = _r;
    }

    boolean accept(ShapeVisitorI ask) {
        return ask.forCircle(r);
    }

}
