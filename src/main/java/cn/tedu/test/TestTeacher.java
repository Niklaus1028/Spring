package cn.tedu.test;

import cn.tedu.beans.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 10:46 下午
 */
//自动注入
public class TestTeacher {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
