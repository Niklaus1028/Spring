package cn.tedu.person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 10:13 上午
 */
public class Person01 {
    public void eat() {
        System.out.println("eating.....");
    }

    public void sleep() {
        System.out.println("sleeping.....");
    }

    /**
     * SpringIOC方式创建并管理bean
     */
    @Test
    public void test01() {
        //初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从Spring容器中获取bean对象
        Person01 p = (Person01) context.getBean("person01");
        //调用对象上的方法
        p.eat();
        p.sleep();
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();

    }
   /*
   通过class来获取bean
   bean可以没有但是不能重复
   */

    /**
     * * * * * * *
     * 获取对象的方式 通过id获取bean
     * 如果找不到，抛异常NoSuchBeanDefinitionException 如果找到唯一的，返回对象 因为id不重复，不可能找到多个
     * 通过class获取bean
     * 如果找不到,抛出异常NoSuchBeanDefinitionException
     * 如果找到唯一，返回对象
     * 如果找到多个，抛出异常NoUniqueBeanDefinitionException
     */
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person01 p1 = context.getBean(Person01.class);
        p1.sleep();
        p1.eat();
        ((ClassPathXmlApplicationContext) context).close();

    }
//通过class获取时如果没有该类型的bean会到配置文件找看核心配置文件中有没有该类子类的bean标签
    @Test
    public void test03() {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Person01 bean = context.getBean(Person01.class);
        bean.eat();
        bean.sleep();
        System.out.println(bean);
        ((ClassPathXmlApplicationContext) context).close();
    }
    //别名标签
    @Test
    public void testo4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过别名获取bean
        Person01 pers = (Person01) context.getBean("pers");
        System.out.println(pers);
        ((ClassPathXmlApplicationContext) context).close();

    }


}

class Teacher extends Person01 {

}
