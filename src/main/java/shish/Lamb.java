package shish;

/**
 * Created by super on 2018/11/17.
 */
public class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s){
        s = _s;
    }

    boolean onlyOnion(){
        return ooFn.forLamb(s);
    }

    boolean isVegetarian(){
        return ivFn.forLamb(s);
    }
}
