package demo.headfirst.adapter;

/**
 * Created by alun on 2018/7/21.
 * 文件描述${TODO}
 * 基本功能：这是火鸡的实现类
 */
public class ATurkey implements Turkey {
    @Override
    public void quackSmall() {
        System.out.println("火鸡------>quackSmall");
    }

    @Override
    public void flySlow() {
        System.out.println("火鸡--------->flySlow");
    }
}
