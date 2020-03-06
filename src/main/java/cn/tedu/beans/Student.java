package cn.tedu.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author XiangRui
 * @create 2020-03-06 9:09 下午
 */
@Component
public class Student {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("#{@l1}")
    private List<String> list;
    @Value("#{@s1}")
    private Set<String> set;
    @Value("#{@m1}")
    private Map<String,String> map;
    @Value("#{@p1}")
    private Properties props;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", props=" + props +
                '}';
    }
}
