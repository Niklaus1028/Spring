package cn.tedu.web;

import cn.tedu.config.MyConfig;
import cn.tedu.service.FirstService;
import cn.tedu.untils.JDBCUtils;
import com.tecent.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XiangRui
 * @create 2020-03-07 11:36 上午
 */
@Controller
public class FirstController {
    @Autowired
    private JDBCUtils jdbcUtils;
    @Autowired
    private User user ;
    @RequestMapping("/first.action")
    public void test() {
        jdbcUtils.initDB();
        System.out.println(user);
    }
}
