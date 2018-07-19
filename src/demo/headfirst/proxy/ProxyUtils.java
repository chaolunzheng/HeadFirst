package demo.headfirst.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class ProxyUtils {
    public static PersonBean getProxy(PersonBean bean, InvocationHandler handler) {
        return (PersonBean) Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                handler);
    }
}
