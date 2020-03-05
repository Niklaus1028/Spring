package cn.tedu.test;

import cn.tedu.person.Person02;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 11:53 上午
 */
//静态工厂方式
public class TestPerson02 {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person02 p2 = (Person02) context.getBean("person02");
        System.out.println(p2);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
