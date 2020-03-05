package cn.tedu.beans;

/**
 * @author XiangRui
 * @create 2020-03-05 10:42 下午
 */
public class Teacher {
    private Dog dog;
    private Cat cat;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
