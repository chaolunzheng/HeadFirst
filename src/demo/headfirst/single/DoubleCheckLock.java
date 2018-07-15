package demo.headfirst.single;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：双重验证加锁
 */
public class DoubleCheckLock {
    //TODO java5时候增强了volatile的语义，使得new对象的时候初始化空间不会重排序在赋值引用之后
    private static volatile DoubleCheckLock instance;

    private DoubleCheckLock() {
    }

    //性能在饿汉式和懒汉式中最优
    public static DoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLock.class) {
                if (instance == null) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
