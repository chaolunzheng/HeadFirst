package demo.headfirst.observer1jdk;

import java.util.Observer;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：测试jdk自带的观察者模式，缺点：主题对象是类而不是接口，只能单继承
 */
public class Test {
    public static void main(String[] args) {
        OneSubject subject = new OneSubject();
        Observer o1 = new OneObserver(subject);
        Observer o2 = new OneObserver(subject);
        Observer o3 = new OneObserver(subject);
        Observer o4 = new OneObserver(subject);

        subject.setChange();
    }
}
