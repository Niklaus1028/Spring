package cn.tedu.beans;

/**
 * @author XiangRui
 * @create 2020-03-05 10:50 下午
 */
//构造方法的属性注入
public class Student {
    private int id;
    private String name;
    private Dog dog;

    public Student() {
    }

    public Student(int id, String name, Dog dog) {
        this.id = id;
        this.name = name;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
