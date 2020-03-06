package cn.tedu.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author XiangRui
 * @create 2020-03-06 9:49 下午
 */
@Component
public class Dog {
    @Value("大黄")
    private String name;
    @Value("13")
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
