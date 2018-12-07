package expr;


/**
 * Created by super on 2018/11/23.
 */
interface ExprVisitorI {
    Object forPlus(Expr l,Expr r);
    Object forDiff(Expr l,Expr r);
    Object forProd(Expr l,Expr r);
    Object forConst(Object c);
}
