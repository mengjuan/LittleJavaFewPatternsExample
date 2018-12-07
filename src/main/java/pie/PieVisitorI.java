package pie;

/**
 * Created by super on 2018/11/20.
 */
public interface PieVisitorI {
//    Object forBot();
//    Object forTop(Object t, Pie r);

    Object forBot(Bot that);
    Object forTop(Top that);
}
