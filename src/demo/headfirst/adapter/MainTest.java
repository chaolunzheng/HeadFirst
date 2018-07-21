package demo.headfirst.adapter;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：测试适配器模式
 */
public class MainTest {
    public static void main(String[] args) {
        //将一只火鸡适配为一只鸭子使用
        Duck turkeyDuck = new DuckAdapter(new ATurkey());
        System.out.println("-------鸭子飞的快--------");
        turkeyDuck.flyFast();
        System.out.println("------鸭子叫的声音大--------");
        turkeyDuck.quackBig();
    }
}
