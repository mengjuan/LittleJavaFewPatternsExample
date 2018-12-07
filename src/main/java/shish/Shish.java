package shish;

/**
 * Created by super on 2018/11/17.
 */
abstract class Shish {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    IsVegetarian ivFn = new IsVegetarian();
    abstract boolean onlyOnion();
    abstract boolean isVegetarian();
}
