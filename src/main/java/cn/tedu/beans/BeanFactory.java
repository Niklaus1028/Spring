package cn.tedu.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author XiangRui
 * @create 2020-03-06 9:00 下午
 */
@Component
public class BeanFactory {
    @Bean("per2")
    public Person getInstance(){
        return new Person();
    }
}
