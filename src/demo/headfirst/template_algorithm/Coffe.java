package demo.headfirst.template_algorithm;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：咖啡的冲泡流程
 */
public class Coffe extends CoffeineTemplate {
    @Override
    protected void addIntigrident() {
        System.out.println("这里应该用不到了");
    }

    @Override
    protected void brew() {
        System.out.println("将水*快速的*倒进咖啡中");
    }

    @Override
    public boolean hook() {
        //修改了钩子方法,这里不需要假如调味品
        System.out.println("修改了钩子，改变了模板的某些行为，这里咖啡不需要调味品");
        return false;
    }
}
