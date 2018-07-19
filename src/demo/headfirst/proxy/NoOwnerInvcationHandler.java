package demo.headfirst.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class NoOwnerInvcationHandler implements InvocationHandler {
    private PersonBean target;
    public NoOwnerInvcationHandler(PersonBean target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        String methodName = method.getName();
        if(methodName.startsWith("get")){
            System.out.println("get访问开始");
            return method.invoke(target, args);
        }else if(methodName.startsWith("setIn")){
            throw new RuntimeException("不可以修改别人的兴趣");
        }else if(methodName.startsWith("set")){
            System.out.println("修改结束");
            return method.invoke(target, args);
        }
        return null;
    }
}
