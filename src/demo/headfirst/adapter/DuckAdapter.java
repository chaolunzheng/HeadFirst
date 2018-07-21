package demo.headfirst.adapter;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：适配器，将一只火鸡适配到鸭子的接口上，适配器必须实现目标接口
 */
public class DuckAdapter implements Duck {
    //持有一个火鸡的引用，这是能转化的原因
    Turkey turkey;
    public DuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quackBig() {
        //委托给被适配对象
        System.out.println("我本来是一只火鸡，叫声很小");
        turkey.quackSmall();
    }

    @Override
    public void flyFast() {
        System.out.println("我其实是一只火鸡飞不快");
        turkey.flySlow();
    }
}
