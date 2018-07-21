package demo.headfirst.template_algorithm;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：茶叶的主要成分也是咖啡因
 */
public class Tea extends CoffeineTemplate {
    @Override
    protected void addIntigrident() {
        System.out.println("加入茶叶调料品......");
    }

    @Override
    protected void brew() {
        System.out.println("将水*慢慢的*倒进茶叶中冲泡");
    }

    @Override
    public boolean hook() {
        System.out.println("我选择覆盖了钩子，但是我啥也没修改");
        return super.hook();
    }
}
