package demo.headfirst.observer0;

/**
 * Created by alun on 2018/7/15.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：观察者的实现类
 */
public class ObserverImpl implements Observer {
    private Subject subject;
    //观察者选哟持有一个主题的引用
    public ObserverImpl(Subject subject){
        //订阅该主题
        this.subject = subject;
        this.subject.addObserver(this);
    }

    /**
     * 当主体对象发生变化时，更新观察者
     * @param subject 主题对象
     * @param args 主题对象推送的数据
     */
    @Override
    public void update(Subject subject,Object args) {
        System.out.println("我得到了通知。。。。。。。"+args);
    }
}
