package cn.tedu.test;

import cn.tedu.beans.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 10:55 下午
 */
//基于构造方法的SpringDI
public class TestStudent {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
