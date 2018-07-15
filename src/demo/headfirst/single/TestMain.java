package demo.headfirst.single;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：测试类
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("----------饿汉式------------");
        EHanShi eHanShi1 = EHanShi.getInstance();
        EHanShi eHanShi2 = EHanShi.getInstance();
        System.out.println(eHanShi1==eHanShi2);
        System.out.println("-----------懒汉式-----------");
        LazyStyle lazyStyle1  = LazyStyle.getInstance();
        LazyStyle lazyStyle2  = LazyStyle.getInstance();
        System.out.println(lazyStyle1==lazyStyle2);
        System.out.println("------------双重检查加锁----------");
        DoubleCheckLock checkLock1 = DoubleCheckLock.getInstance();
        DoubleCheckLock checkLock2 = DoubleCheckLock.getInstance();
        System.out.println(checkLock1==checkLock2);
        System.out.println("-----------美剧-----------");
        EnumInstance enumInstance1 = EnumInstance.getInstance();
        EnumInstance enumInstance2 = EnumInstance.getInstance();
        System.out.println(enumInstance1==enumInstance2);
        System.out.println("----------------------");
    }
}
