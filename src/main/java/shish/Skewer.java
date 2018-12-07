package shish;

/**
 * Created by super on 2018/11/17.
 */
public class Skewer extends Shish {
    boolean onlyOnion(){
        return ooFn.forSkewer();
    }

    boolean isVegetarian(){
        return ivFn.forSkewer();
    }
}
