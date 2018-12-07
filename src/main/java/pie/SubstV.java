package pie;

/**
 * Created by super on 2018/11/20.
 */
public class SubstV implements PieVisitorI{
    Object n;
    Object o;
    SubstV(Object _n,Object _o){
        n = _n;
        o = _o;
    }
    public Object forBot(Bot that){
        return new Bot();
    }
    public Object forTop(Object t, Pie r){
        if(o.equals(t)){
            return new Top(n,(Pie)r.accept(this));
        }else{
            return new Top(t,(Pie) r.accept(this));
        }
    }

    public Object forTop(Top that){
        if(o.equals(that.t)){
            that.t = n;
            that.r.accept(this);
            return that;
        }else{
            that.r.accept(this);
            return that;
        }
    }
}
