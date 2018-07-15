package demo.headfirst.abstractFactory;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
//抽象工厂，每一个方法都是工厂方法
public interface PizzaIntegridentFactory {
    Reds createRed();
    Shapes createShape();
}
