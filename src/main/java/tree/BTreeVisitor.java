package tree;

import fruit.Fruit;

/**
 * Created by super on 2018/11/22.
 */
interface  BTreeVisitor {
    boolean forBut();
    boolean forFlat(Fruit f, Tree t);
    boolean forSplit(Tree l, Tree r);
}
