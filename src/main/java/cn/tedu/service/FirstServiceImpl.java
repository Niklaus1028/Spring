package cn.tedu.service;


import org.springframework.stereotype.Service;

/**
 * @author XiangRui
 * @create 2020-03-07 11:38 上午
 */
@Service
public class FirstServiceImpl implements FirstService  {

    @Override
    public void first() {
        System.out.println("FirstService....");

    }
}
