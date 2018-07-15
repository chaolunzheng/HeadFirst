package demo.headfirst.observer0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class SubjextImpl implements Subject {
    private boolean flag;
    private List<Observer> list = new ArrayList<>();

    @Override
    public boolean isChanged() {
        flag = true;
        return true;
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        if (!list.isEmpty() && list.contains(observer)) {
            list.remove(observer);
            return;
        }
        throw new RuntimeException("没有观察者了异常");
    }

    @Override
    public void notifyObervers() {
        if (flag) {
            int i = 1;
            for (Observer o : list) {
                o.update(this, i++);
            }
        }
        flag = false;
    }

    //测试方法
    public void setChange() {
        isChanged();
        notifyObervers();
    }
}
