package demo.headfirst.proxy;

/**
 * Created by alun on 2018/7/19.
 * 小白一个，请勿喷，欢迎各位大神批评指正.
 * 文件描述${TODO}
 * 基本功能：
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    private String intreste;
    private String hotOrNotRate;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getIntreste() {
        return intreste;
    }

    @Override
    public String getHotOrNotRate() {
        return hotOrNotRate;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setIntreste(String intreste) {
        this.intreste = intreste;
    }

    @Override
    public void setHotOrNotRate(String hotOrNotRate) {
        this.hotOrNotRate = hotOrNotRate;
    }
}
