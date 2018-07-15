package demo.headfirst.observer0;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能： 可被观察的主题
 */
public interface Subject {
    boolean isChanged();
    //订阅主题
    void addObserver(Observer observer);
    //取消订阅
    void delObserver(Observer observer);
    //通知所有观察者
    void notifyObervers();
}
