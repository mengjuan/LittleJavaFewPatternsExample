package pizza;

/**
 * Created by super on 2018/11/17.
 */
public class Sausage extends Pizza {
    Pizza p;
    Sausage(Pizza _p){
        p = _p;
    }
    Pizza remA(){
        return new Sausage(p.remA());
    }

    Pizza topAwC(){
        return new Sausage(p.topAwC());
    }

    Pizza subAbC(){
        return new Sausage(p.subAbC());
    }
}
