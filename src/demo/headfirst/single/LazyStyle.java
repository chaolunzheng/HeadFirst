package demo.headfirst.single;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class LazyStyle {
    private LazyStyle() {
    }

    private static LazyStyle instance;

    public static synchronized LazyStyle getInstance() {
        //TODO 懒汉式
        if(instance==null){
            instance = new LazyStyle();
        }
        return instance;
    }
}
