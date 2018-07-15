package demo.headfirst.abstractFactory;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class JiangSuPizzaIntigridentFactory implements PizzaIntegridentFactory {
    @Override
    public Reds createRed() {
        return new DaReds();
    }

    @Override
    public Shapes createShape() {
        return new DaShape();
    }
}
