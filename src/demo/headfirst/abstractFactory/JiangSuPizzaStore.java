package demo.headfirst.abstractFactory;

/**
 * Created by alun on 2018/7/14.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class JiangSuPizzaStore extends PizzaStore {
    public JiangSuPizzaStore() {
        System.out.println("JiangSuPizzaStore is building...");
    }

    @Override
    protected Pizza createPizza(PizzaTaste pizzaTaste) {
        JiangSuPizzaIntigridentFactory factory = new JiangSuPizzaIntigridentFactory();

        if(pizzaTaste== PizzaTaste.LA){
            return new JiangSuLaPizza(factory);
        }else{
            return new JiangSuTianPizza(factory);
        }
    }
}
