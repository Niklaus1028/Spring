package cn.tedu.test;

import cn.tedu.beans.Hero;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 10:26 下午
 */

public class TestSpringDI {
    //通过getter setter方式实现DI,普通属性注入
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hero hero = (Hero) context.getBean("hero");
        System.out.println(hero);
        ((ClassPathXmlApplicationContext) context).close();
    }
    //自定义bean属性注入
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Hero hero = (Hero) context.getBean("hero");
        System.out.println(hero);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
