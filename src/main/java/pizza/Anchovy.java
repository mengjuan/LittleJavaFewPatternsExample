package pizza;

/**
 * Created by super on 2018/11/17.
 */
public class Anchovy extends Pizza{
    Pizza p;
    Anchovy(Pizza _p){
        p = _p;
    }

    Pizza remA(){
        return remFn.forAnchovy(p);
    }

    Pizza topAwC(){
        return new Cheese(new Anchovy(p.topAwC()));
    }
    Pizza subAbC(){
        return new Cheese(p.subAbC());
    }
}
