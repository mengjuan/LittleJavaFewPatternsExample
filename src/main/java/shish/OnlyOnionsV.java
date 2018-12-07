package shish;

/**
 * Created by super on 2018/11/18.
 */
public class OnlyOnionsV {
    boolean forSkewer(){
      return  true;
    }
    boolean forOnion(Shish s){
        return s.onlyOnion();
    }
    boolean forLamb(Shish s){
        return false;
    }
    boolean forTomato(Shish s){
        return false;
    }
}
