package cn.tedu.test;

import cn.tedu.dao.ProdDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiangRui
 * @create 2020-03-05 9:47 下午
 */
public class TestProdDao {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        ProdDao prodDao = (ProdDao) context.getBean("prodDao");
        prodDao.addProd();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
