package pizza;

/**
 * Created by super on 2018/11/17.
 */
public class Cheese extends Pizza {
    Pizza p;
    Cheese(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Cheese(p.remA());
    }

    Pizza topAwC(){
        return new Cheese(p.topAwC());
    }

    Pizza subAbC(){
        return new Cheese(p.subAbC());
    }
}
