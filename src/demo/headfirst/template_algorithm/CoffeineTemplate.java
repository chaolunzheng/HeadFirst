package demo.headfirst.template_algorithm;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：模板方法抽象类
 */
public abstract class CoffeineTemplate {
    //封装一系列的固定的算法步骤(方法)，声明其为final的，子类必须按照这个框架办事情
    public final void prepareTemplateMethod(){
        //算法的步骤(一些方法)
        boilWater();
        brew();
        pourInCup();
        //这里如果不覆盖钩子方法，那么都将会有执行加入调料的流程
        if(hook()){
            addIntigrident();
        }
    }

    //钩子方法，什么也不干，可以交由子类选择性地实现，改变模板的某些决策
    public boolean hook() {return true;}

    //具体加什么调料成分交给子类，加入调味品
    protected abstract void addIntigrident();

    //其中一个步骤，将饮料放进杯子
    public void pourInCup() {
        System.out.println("将饮料倒进杯子...........");
    }

    //具体的冲泡方法被抽象了，由子类去实现，冲泡
    protected abstract void brew();

    //把水烧开公用的
    public void boilWater() {
        System.out.println("把水烧开煮沸.........");
    }
}
