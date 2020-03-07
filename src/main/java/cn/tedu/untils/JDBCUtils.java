package cn.tedu.untils;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author XiangRui
 * @create 2020-03-07 3:14 下午
 */
public class JDBCUtils {
    @Value("${db.driverName}")
    private String driverName;
    @Value("${db.jdbcUrl}")
    private String jdbcUrl;
    @Value("${db.user}")
    private String user;
    @Value("${db.password}")
    private String password;

    public JDBCUtils(String name){
        System.out.println("JDBCUtils..init..");

    }
    public void initDB(){
        System.out.println("初始化数据库"+driverName+"..."+jdbcUrl+".."+user+"..."+password);
    }

}
