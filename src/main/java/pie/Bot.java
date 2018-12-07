package pie;

/**
 * Created by super on 2018/11/19.
 */
public class Bot extends Pie{
//    Pie rem( RemV remV){
//        return remV.forBot();
//    }
//    Pie subst(SubstV substFn){
//        return substFn.forBot();
//    }
    Object accept(PieVisitorI ask){
        return ask.forBot(this);
    }
}
