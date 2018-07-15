package demo.headfirst.strategyPattern;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：鸭子的实现类
 */
public class BlackDuck extends Duck {
    //构建行为
    public BlackDuck() {
        flyBehavious = new FlyNoWay();
        quackBehavious = new QuackBig();
    }

    //黑鸭子
    @Override
    public void display() {
        System.out.println("这是一只黑鸭子");
    }

    //改变鸭子飞的方式
    public void setFlyBehavious(FlyBehavious flyBehavious) {
        this.flyBehavious = flyBehavious;
    }
}
