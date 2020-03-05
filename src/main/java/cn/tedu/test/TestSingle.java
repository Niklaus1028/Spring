package cn.tedu.test;

import cn.tedu.single.SingleDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 2:13 下午
 */

public class TestSingle {
    //spring默认创建bean默认是单例
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        SingleDemo demo1 = (SingleDemo) context.getBean("demo");
        System.out.println(demo1);
        SingleDemo demo2 = (SingleDemo) context.getBean("demo");
        System.out.println(demo2);

    }

    //手动配置Spring核心配置文件为多例
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        SingleDemo demo1 = (SingleDemo) context.getBean("demo1");
        System.out.println(demo1);
        Object demo2 = context.getBean("demo1");
        System.out.println(demo2);

    }

}
