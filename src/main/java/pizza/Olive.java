package pizza;

/**
 * Created by super on 2018/11/17.
 */
public class Olive extends Pizza {
    Pizza p;
    Olive(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Olive(p.remA());
    }

    Pizza topAwC(){
        return new Olive(p.topAwC());
    }
    Pizza subAbC(){
        return new Olive(p.subAbC());
    }
}
