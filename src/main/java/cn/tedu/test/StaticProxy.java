package cn.tedu.test;

import cn.tedu.staticproxy.JJRStaticProxy;
import org.junit.Test;

/**
 * @author XiangRui
 * @create 2020-03-06 10:17 下午
 */
//静态代理
public class StaticProxy {
    private JJRStaticProxy proxy = new JJRStaticProxy();
    @Test
    public void test01(){
         proxy.eat();
         proxy.sing();
         proxy.film();
    }
}
