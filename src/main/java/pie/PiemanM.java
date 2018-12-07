package pie;

/**
 * Created by super on 2018/12/5.
 */
public class PiemanM implements  PiemanI {
    Pie p = new Bot();
    public int addTop(Object t) {
        p =  new Top(t,p);

        return occTop(t);
    }

    public int remTop(Object t) {
        return 0;
    }

    public int substTop(Object n, Object o) {
        return 0;
    }

    public int occTop(Object t) {
        return 0;
    }
}
