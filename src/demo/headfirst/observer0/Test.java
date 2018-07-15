package demo.headfirst.observer0;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class Test {
    public static void main(String[] args) {
        SubjextImpl subject = new SubjextImpl();
        Observer o1 = new ObserverImpl(subject);
        Observer o2 = new ObserverImpl(subject);
        Observer o3 = new ObserverImpl(subject);
        Observer o4 = new ObserverImpl(subject);

        subject.setChange();
    }
}
