package demo.headfirst.strategyPattern;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        Duck duck = new BlackDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("------------修改行为-----------");
        duck.setFlyBehavious(new FlyFast());
        duck.performFly();
    }
}
