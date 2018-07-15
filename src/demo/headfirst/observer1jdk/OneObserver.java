package demo.headfirst.observer1jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能： 使用jdk自己的观察者模式
 */
public class OneObserver implements Observer{
    public static int i;
    Observable subject;
    public OneObserver() {
    }
    //持有一个主题的引用
    public OneObserver(Observable subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.toString()+" "+(++i)+"被"+o.toString()+"通知了:"+arg);
    }

    @Override
    public String toString() {
        return "OneObserver{}";
    }
}
