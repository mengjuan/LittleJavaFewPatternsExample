package shish;

/**
 * Created by super on 2018/11/17.
 */
public class Onion extends Shish {
    Shish s;
    Onion(Shish _s){
        s = _s;
    }
    boolean onlyOnion(){
        return  ooFn.forOnion(s);
    }
    boolean isVegetarian(){
        return ivFn.forOnion(s);
    }
}
