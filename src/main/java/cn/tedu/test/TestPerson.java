package cn.tedu.test;

import cn.tedu.beans.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author XiangRui
 * @create 2020-03-06 8:38 下午
 */

public class TestPerson {
    //注解方式实现IOC,默认id为看类名的第二个字母，如果第二个字母是小写，首字母要变小写，如果第二个字母为大写，其他不变
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("per");
        System.out.println(person);
        ((ClassPathXmlApplicationContext) context).close();
    }
    //通过工厂来获取bean
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person per2 = (Person) context.getBean("per2");
        System.out.println(per2);
        ((ClassPathXmlApplicationContext) context).close();
    }



}
