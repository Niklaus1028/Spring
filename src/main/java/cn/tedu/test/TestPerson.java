package cn.tedu.test;

import cn.tedu.person.Person02;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 11:48 上午
 */
//实现Spring中自带FactoryBean接口
public class TestPerson {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person02 bean = (Person02) context.getBean("person02");
        System.out.println(bean);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
