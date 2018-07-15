package demo.headfirst.strategyPattern;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class FlyNoWay implements FlyBehavious {
    @Override
    public void fly() {
        System.out.println("这是鸭子不会飞的");
    }
}
