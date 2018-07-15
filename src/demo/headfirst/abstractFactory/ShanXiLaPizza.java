package demo.headfirst.abstractFactory;

/**
 * Created by alun on 2018/7/14.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class ShanXiLaPizza extends Pizza {
    public ShanXiLaPizza(PizzaIntegridentFactory factory) {
        this.factory = factory;
    }
    @Override
    public void prepare() {
        this.color = factory.createRed();
        this.shape = factory.createShape();
    }
    @Override
    public void hot() {
        System.out.println("ShanXiLaPizza hot()");
    }

    @Override
    public void cut() {
        System.out.println("ShanXiLaPizza cut()");
    }

    @Override
    public void box() {
        System.out.println("ShanXiLaPizza box()");
    }
}
