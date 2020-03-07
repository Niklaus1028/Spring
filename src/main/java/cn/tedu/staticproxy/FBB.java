package cn.tedu.staticproxy;

/**
 * @author XiangRui
 * @create 2020-03-06 10:14 下午
 */
public class FBB implements SJSkill {
    @Override
    public void eat() {
        System.out.println("范冰冰在陪客吃饭");
    }

    @Override
    public void sing() {
        System.out.println("范冰冰在卖唱");

    }

    @Override
    public void film() {
        System.out.println("拍电影");
    }
}
