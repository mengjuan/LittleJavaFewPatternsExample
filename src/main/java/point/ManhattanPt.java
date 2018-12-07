package point;

/**
 * Created by super on 2018/11/17.
 */
public class ManhattanPt extends Point {

    ManhattanPt(int _x,int _y){
        super(_x,_y);
    }

    int distanceToO() {
        return x+y;
    }
}
