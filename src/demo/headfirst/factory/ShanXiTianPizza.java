package demo.headfirst.factory;

/**
 * Created by alun on 2018/7/14.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class ShanXiTianPizza extends Pizza {
    @Override
    public void hot() {
        System.out.println("ShanXiTianPizza hot()");
    }

    @Override
    public void cut() {
        System.out.println("ShanXiTianPizza cut()");
    }

    @Override
    public void box() {
        System.out.println("ShanXiTianPizza box()");
    }
}
