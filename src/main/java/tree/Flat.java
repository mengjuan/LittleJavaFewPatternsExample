package tree;

import fruit.Fruit;

/**
 * Created by super on 2018/11/22.
 */
public class Flat extends Tree{
    Fruit f;
    Tree t;
    Flat(Fruit _f, Tree _t){
        f = _f;
        t = _t;
    }

    boolean accept(BTreeVisitor ask) {
        return ask.forFlat(f,t);
    }
}
