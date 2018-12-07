package shish;

/**
 * Created by super on 2018/11/17.
 */
public class TestMain {

    public static void main(String[] args){
        boolean flag0 = new Onion(new Onion(new Skewer())).onlyOnion();
        boolean flag1 = new Onion(new Lamb(new Skewer())).onlyOnion();
        System.out.println(flag0+"  "+flag1);

        boolean flag2 =new Onion(new Tomato(new Onion(new Skewer()))).isVegetarian();
        System.out.println(flag2);


    }
}
