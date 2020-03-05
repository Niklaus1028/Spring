package cn.tedu.factory;

import cn.tedu.person.Person02;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author XiangRui
 * @create 2020-03-05 11:42 上午
 */
//工厂类实现bean工厂的方式，Spring中有FactoryBean
public class BeanFactory2 implements FactoryBean {
    @Override
    public Person02 getObject() throws Exception {
        return new Person02("xx");
    }
//返回对象类型
    @Override
    public Class<?> getObjectType() {
        return Person02.class;
    }
//返回对象是否单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
