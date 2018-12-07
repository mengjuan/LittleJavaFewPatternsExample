package expr;

/**
 * Created by super on 2018/11/23.
 */
abstract class Expr {
    abstract Object accept(ExprVisitorI ask);
}
