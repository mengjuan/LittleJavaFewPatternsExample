package point;

/**
 * Created by super on 2018/11/17.
 */
public class CartesianPt extends Point{

 CartesianPt(int _x,int _y){
     super(_x, _y);
 }
 int distanceToO(){
     return (int)Math.sqrt(x*x+y*y);
 }

}
