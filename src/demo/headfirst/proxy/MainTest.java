package demo.headfirst.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：测试代理模式
 */
public class MainTest {
    public static void main(String[] args) {
        //接口实现类
        PersonBean personBean = new PersonBeanImpl();
        //代理的两个处理器实现
        InvocationHandler handler = new OwnerInvcationHandler(personBean);
        InvocationHandler handlerN = new NoOwnerInvcationHandler(personBean);

        //获取代理
        PersonBean proxy1 = ProxyUtils.getProxy(personBean,handler);
        proxy1.setIntreste("running");
//        proxy1.setHotOrNotRate("100");
        System.out.println("------------->>>>");
        PersonBean proxy2 = ProxyUtils.getProxy(personBean,handlerN);
        proxy2.setName("proxy2");
        proxy2.setIntreste("huang");
    }
}
