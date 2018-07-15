package demo.headfirst.abstractFactory;

/**
 * Created by alun on 2018/7/14.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class ShanXiPizzaStore extends PizzaStore {
    public ShanXiPizzaStore() {
        System.out.println("ShanXiPizzaStore is building...");
    }

    @Override
    protected Pizza createPizza(PizzaTaste pizzaTaste) {
        ShanXiPizzaIntigridentFactory factory =new ShanXiPizzaIntigridentFactory();
        if(pizzaTaste==PizzaTaste.TIAN){
            return new ShanXiTianPizza(factory);
        }else{
            return new ShanXiLaPizza(factory);
        }
    }
}
