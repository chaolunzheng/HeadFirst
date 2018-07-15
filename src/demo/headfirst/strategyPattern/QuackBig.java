package demo.headfirst.strategyPattern;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class QuackBig implements QuackBehavious {
    @Override
    public void quack() {
        System.out.println("这只鸭子叫得很大声.........");
    }
}
