package cn.tedu.test;

import cn.tedu.beans.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-06 9:11 下午
 */

public class TestStudent {
    //Spring基于注解方式实现DI
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
