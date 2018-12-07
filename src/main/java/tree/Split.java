package tree;

/**
 * Created by super on 2018/11/22.
 */
public class Split extends Tree {
    Tree l;
    Tree r;
    Split(Tree _l, Tree _r){
        l = _l;
        r = _r;
    }

    boolean accept(BTreeVisitor ask) {
        return ask.forSplit(l,r);
    }
}
