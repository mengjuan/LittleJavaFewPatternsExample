package pizza;

/**
 * Created by super on 2018/11/17.
 */
public class Crust extends Pizza {
    Pizza remA(){
       return remFn.forCrust();
    }
    Pizza topAwC(){
        return new Crust();
    }
    Pizza subAbC(){
        return new Crust();
    }
}
