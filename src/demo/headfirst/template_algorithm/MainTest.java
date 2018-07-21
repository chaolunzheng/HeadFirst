package demo.headfirst.template_algorithm;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：测试模板方法模式
 */
public class MainTest {
    public static void main(String[] args) {
        //高层调用低层
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        //产生不同行为
        tea.prepareTemplateMethod();
        System.out.println("===========>");
        coffe.prepareTemplateMethod();
    }
}
