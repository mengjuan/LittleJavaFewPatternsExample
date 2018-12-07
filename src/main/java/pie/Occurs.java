package pie;

/**
 * Created by super on 2018/12/5.
 */
public class Occurs implements PieVisitorI {
    Object a;
    Occurs(Object _a){
        a = _a;
    }
    public Object forBot(Bot that) {
        return new Integer(0);
    }

//    public Object forTop(Object t, Pie r) {
//        if(a.equals(t)){
//            return new Integer(1+(Integer)(r.accept(this)));
//
//        }else{
//            return r.accept(this);
//        }
//    }

    public Object forTop(Top that) {
        if(a.equals(that.t)){
            return new Integer(1+(Integer)(that.r.accept(this)));

        }else{
            return that.r.accept(this);
        }
    }
}
