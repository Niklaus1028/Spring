package cn.tedu;

import cn.tedu.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author XiangRui
 * @create 2020-03-07 11:44 上午
 */
/*@SpringBootApplication
    @EnableAutoConfiguration 自动生成配置信息
    @SpringBootConfiguration 加载配置文件  将当前类标识为配置类@configuration
    @ComponentScan  必须在一个配置类上@Configuration上
    package cn.tedu; 用来将当前包及其子孙包进行包扫描

* */

@SpringBootApplication
public class MySpringBootStarter01 {

    public static void main(String[] args) {
        //反射类上的注解启动程序，扫描时发现@SpringBootApplication
        //此注解的作用是基于Spring以及SpringMVC的运行环境启动内部的Tomcat来启动项目，提供访问。
        SpringApplication.run(MySpringBootStarter01.class,args);
    }

}
