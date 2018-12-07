package pie;

/**
 * Created by super on 2018/11/19.
 */
public class Top extends Pie {
    Object t;
    Pie r;
    Top(Object _t,Pie _r){
        t = _t;
        r = _r;
    }
//    Pie rem(RemV remV){
//        return remV.forTop(t,r);
//    }
//    Pie subst(SubstV substFn){
//        return substFn.forTop(t,r);
//
//    }

    public Object accept(PieVisitorI ask){
        return ask.forTop(this);
    }

}
