package cn.tedu.factory;

import cn.tedu.person.Person02;

/**
 * @author XiangRui
 * @create 2020-03-05 11:07 上午
 */
public class BeanFactory {
    //私有化构造方法
    private BeanFactory() {
    }
    //对外界提供公共的获取实例的静态方法
    public static Person02 getInstance(){
        return new Person02("zy");
    }
}
