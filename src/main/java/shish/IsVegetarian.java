package shish;

/**
 * Created by super on 2018/11/19.
 */
public class IsVegetarian {
    boolean forSkewer(){
        return true;
    }

    boolean forOnion(Shish s){
        return s.isVegetarian();
    }

    boolean forTomato(Shish s){
        return s.isVegetarian();
    }

    boolean forLamb(Shish s){
        return false;
    }
}
