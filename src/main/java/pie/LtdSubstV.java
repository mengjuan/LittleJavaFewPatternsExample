package pie;

/**
 * Created by super on 2018/11/21.
 */
public class LtdSubstV implements PieVisitorI {
    Object n;
    Object o;
    int c;
    LtdSubstV(int _c,Object _n,Object _o){
        c = _c;
        n = _n;
        o = _o;
    }

    public Pie forBot() {
        return new Bot();
    }

    public Pie forTop(Object t, Pie r) {
        if(c>0&&t.equals(o)){
            return new Top(n,r.accept(new LtdSubstV(c-1,n,o)));
        }else{
            return new Top(t,r.accept(this));
        }
    }
}
