package demo.headfirst.factory;

/**
 * Created by chaolun on 2018/7/14.
 * 这是一个store的抽象类
 */
public abstract class PizzaStore {
    public void orderPizza(PizzaTaste taste){
        Pizza pizza=createPizza(taste);
        pizza.hot();
        pizza.cut();
        pizza.box();
    }
    protected abstract Pizza createPizza(PizzaTaste pizzaTaste);
}
