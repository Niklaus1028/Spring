package cn.tedu.config;

import cn.tedu.untils.JDBCUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author XiangRui
 * @create 2020-03-07 3:18 下午
 */
@Configuration
@ComponentScan("com.tecent.beans")
public class MyConfig {
    @Bean("jdbcUtils")
    public JDBCUtils getJDBCUtils(){
        return new JDBCUtils("xxx");
    }
}
