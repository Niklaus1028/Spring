package cn.tedu.test;

import cn.tedu.lazy.LazyInit;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 9:31 下午
 */
public class TestLazyInit {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        LazyInit lazyInit = (LazyInit) context.getBean("lazyInit");
        lazyInit.eat();
        lazyInit.sleep();
        System.out.println(lazyInit);

    }
}
