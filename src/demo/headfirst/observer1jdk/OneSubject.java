package demo.headfirst.observer1jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：主题类，不是接口了
 */
public class OneSubject extends Observable {
    public static String seq = "\"这是改变的数据data\"";

    //测试入口
    public void setChange(){
        setChanged();
        notifyObservers(seq);
    }

    @Override
    public String toString() {
        return "OneSubject{}";
    }
}
