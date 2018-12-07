package point;

/**
 * Created by super on 2018/11/17.
 */
abstract class Point {
    int x;
    int y;
    Point(int _x,int _y){
        x = _x;
        y = _y;
    }
    int moveBy(int mx,int my){
        x = x+mx;
        y = y+mx;
        return distanceToO();
    }
    abstract int distanceToO();

    boolean closeToO(Point p){
        return distanceToO()<= p.distanceToO();
    }
}
