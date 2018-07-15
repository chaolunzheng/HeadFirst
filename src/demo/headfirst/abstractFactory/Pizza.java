package demo.headfirst.abstractFactory;

/**
 * Created by chaolun on 2018/7/14.
 * 披萨的抽象类
 */
public abstract class Pizza {
    PizzaIntegridentFactory factory;

    public Reds color;
    public Shapes shape;
    public abstract void prepare();
    public abstract void hot();
    public abstract void cut();
    public abstract void box();
}
