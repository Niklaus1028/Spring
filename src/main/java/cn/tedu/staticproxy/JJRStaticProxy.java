package cn.tedu.staticproxy;

/**
 * @author XiangRui
 * @create 2020-03-06 10:16 下午
 */
public class JJRStaticProxy implements SJSkill {
    private FBB fbb = new FBB();
    @Override
    public void eat() {
        fbb.eat();

    }

    @Override
    public void sing() {
        fbb.sing();

    }

    @Override
    public void film() {
        fbb.film();
    }
}
