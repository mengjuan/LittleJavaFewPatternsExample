package tree;

/**
 * Created by super on 2018/11/22.
 */
public class Bud extends Tree {

    boolean accept(BTreeVisitor ask) {
        return ask.forBut();
    }
}
