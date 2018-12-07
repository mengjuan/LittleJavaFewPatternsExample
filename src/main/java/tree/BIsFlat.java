package tree;

import fruit.Fruit;

/**
 * Created by super on 2018/11/22.
 */
public class BIsFlat implements BTreeVisitor {

    public boolean forBut() {
        return true;
    }

    public boolean forFlat(Fruit f, Tree t) {
        return t.accept(this);
    }

    public boolean forSplit(Tree l, Tree r) {
        return false;
    }
}
