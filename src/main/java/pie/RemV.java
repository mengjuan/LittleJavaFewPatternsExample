package pie;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by super on 2018/11/20.
 */
public class RemV implements PieVisitorI{
    Object o;
    RemV(Object _o){
        o = _o;
    }
    public Object forBot(Bot that){
        return new Bot();
    }
    public Object forTop(Top that){
        if(o.equals(that.t)){
            return that.r.accept(this);
        }else{
            return new Top(that.t,(Pie)that.r.accept(this));
        }
    }
}
