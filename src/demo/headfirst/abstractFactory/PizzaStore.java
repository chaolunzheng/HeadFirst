package demo.headfirst.abstractFactory;

/**
 * Created by chaolun on 2018/7/14.
 * 这是一个store的抽象类
 */
public abstract class PizzaStore {
    public void orderPizza(PizzaTaste taste){
        Pizza pizza=createPizza(taste);
        pizza.prepare();
        pizza.hot();
        pizza.cut();
        pizza.box();
    }
    protected abstract Pizza createPizza(PizzaTaste pizzaTaste);
}
