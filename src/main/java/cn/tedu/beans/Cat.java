package cn.tedu.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author XiangRui
 * @create 2020-03-06 9:49 下午
 */
@Component
public class Cat {
    @Value("小白")
    private String name;
    @Value("2")
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
