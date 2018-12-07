package tree;

import fruit.Apple;

/**
 * Created by super on 2018/11/22.
 */
public class TestMain {

    public static void main(String[] args){
        boolean flag = new Split(new Flat(new Apple(),new Bud()),new Bud()).accept(new BIsFlat());
        System.out.println(flag);
    }
}
