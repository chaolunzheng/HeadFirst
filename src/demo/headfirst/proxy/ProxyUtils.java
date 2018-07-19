package demo.headfirst.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：产生代理的工具类
 */
public class ProxyUtils {
    public static PersonBean getProxy(PersonBean bean, InvocationHandler handler) {
        //JDK动态生成字节码代理类
        return (PersonBean) Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),//目标接口实现类的类加载器
                bean.getClass().getInterfaces(),//代理类要实现接口
                handler);//用的处理器
    }
}
