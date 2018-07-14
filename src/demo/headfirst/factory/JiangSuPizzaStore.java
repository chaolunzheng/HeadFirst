package demo.headfirst.factory;

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
        if(pizzaTaste==PizzaTaste.LA){
            return new JiangSuLaPizza();
        }else{
            return new JiangSuTianPizza();
        }
    }
}
