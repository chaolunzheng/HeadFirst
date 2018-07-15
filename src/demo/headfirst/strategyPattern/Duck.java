package demo.headfirst.strategyPattern;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：鸭子的类，为什么不抽象成接口呢？
 */
public abstract class Duck {
    //将行为委托给这些抽象的行为
    protected FlyBehavious flyBehavious;
    protected QuackBehavious quackBehavious;

    //外表
    public abstract void display();
    public void swim(){
        System.out.println("所有鸭子都会游泳");
    }
    //如何飞
    public void performFly(){
        flyBehavious.fly();
    }
//    如何叫
    public void performQuack(){
        quackBehavious.quack();
    }


    //动态修改行为
    public FlyBehavious getFlyBehavious() {
        return flyBehavious;
    }

    public void setFlyBehavious(FlyBehavious flyBehavious) {
        this.flyBehavious = flyBehavious;
    }

    public QuackBehavious getQuackBehavious() {
        return quackBehavious;
    }

    public void setQuackBehavious(QuackBehavious quackBehavious) {
        this.quackBehavious = quackBehavious;
    }
}
