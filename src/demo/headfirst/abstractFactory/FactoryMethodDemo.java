package demo.headfirst.abstractFactory;

/**
 * Created by chaolun on 2018/7/14.
 * 设计模式：抽象工厂模式
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("demo");
        //得到两个自定义商店
        PizzaStore SXPizza = new ShanXiPizzaStore();
        PizzaStore JSPizza = new JiangSuPizzaStore();
        //造商品
        SXPizza.orderPizza(PizzaTaste.LA);
        SXPizza.orderPizza(PizzaTaste.TIAN);
        System.out.println("------------------");
        JSPizza.orderPizza(PizzaTaste.LA);
        JSPizza.orderPizza(PizzaTaste.TIAN);
    }
}
