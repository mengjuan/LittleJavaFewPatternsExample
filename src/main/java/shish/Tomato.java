package shish;

/**
 * Created by super on 2018/11/17.
 */
public class Tomato extends Shish {
    Shish s;

    Tomato(Shish _s) {
        s = _s;
    }
    boolean onlyOnion(){
        return ooFn.forTomato(s);
    }
    boolean isVegetarian(){
        return ivFn.forTomato(s);
    } 
}
