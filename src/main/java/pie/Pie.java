package pie;


/**
 * Created by super on 2018/11/19.
 */
abstract class Pie {
//    abstract Pie rem(RemV remV);
//    abstract Pie subst(SubstV substFn);

    abstract  Object accept(PieVisitorI ask);
}
