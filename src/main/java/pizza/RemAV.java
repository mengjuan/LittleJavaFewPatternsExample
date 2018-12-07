package pizza;

/**
 * Created by super on 2018/11/19.
 */
public class RemAV {
    Pizza forCrust(){
        return new Crust();
    }
    Pizza forAnchovy(Pizza p){
        return p.remA();
    }
    Pizza forCheese(Pizza p){
        return new Cheese(p.remA());
    }

}
