package demo.headfirst.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：自己的可修的，处理器
 */
public class OwnerInvcationHandler implements InvocationHandler {
    //保存一个目标代理的引用
    private PersonBean target;
    //用于回调目标代理对象的方法
    public OwnerInvcationHandler(PersonBean target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        String methodName = method.getName();
        if(methodName.startsWith("get")){
            System.out.println("访问开始");
            return method.invoke(target, args);
        }else if(methodName.startsWith("setHot")){
            throw new RuntimeException("不可以自己修改评分");
        }else if(methodName.startsWith("set")){
            System.out.println("修改结束");
            return method.invoke(target, args);
        }
        return null;
    }
}
