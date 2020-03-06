package cn.tedu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author XiangRui
 * @create 2020-03-06 9:49 下午
 */
@Component
public class Hero {
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

    @Override
    public String toString() {
        return "Hero{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
