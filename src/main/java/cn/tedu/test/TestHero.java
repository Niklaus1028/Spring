package cn.tedu.test;

import cn.tedu.beans.Hero;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-06 9:52 下午
 */
public class TestHero {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hero hero = (Hero) context.getBean("hero");
        System.out.println(hero);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
