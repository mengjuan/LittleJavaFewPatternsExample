package expr;

/**
 * Created by super on 2018/11/23.
 */
public class Plus extends Expr{
    Expr l;
    Expr r;
    Plus(Expr _l,Expr _r){
        l = _l;
        r = _r;
    }

    Object accept(ExprVisitorI ask) {
        return ask.forPlus(l,r);
    }
}
