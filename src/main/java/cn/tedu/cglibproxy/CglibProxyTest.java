package cn.tedu.cglibproxy;

import cn.tedu.staticproxy.FBB;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author XiangRui
 * @create 2020-03-07 9:31 下午
 */
public class CglibProxyTest {
    final FBB fbb = new FBB();

    @Test
    public void test01() {
        Enhancer enhancer = new Enhancer();
        //设定接口 -- 此方法要求生成的动态代理额外实现指定接口们 ，单cglib动态代理不是靠接口实现的，所 以可以不设置
        enhancer.setInterfaces(fbb.getClass().getInterfaces());
        //设定父类 -- 此处要传入被代理者的类，cglib是通过集成被代理者的类来持有和被代理者相同的方法 的，此方法必须设置
        enhancer.setSuperclass(fbb.getClass());
        //设定回调函数 -- 为增强器设定回调函数，之后通过增强器生成的代理对象调用任何方法都会走到此回调 函数中，实现调用真正被代理对象的方法的效果
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                if ("film".equals(method.getName())) {
                    System.out.println("无论怎样都不拍。。。。。。");
                    return null;
                } else {
                    System.out.println("检查权限");
                    Object returnObj = method.invoke(fbb, args);
                    System.out.println("记录日志");
                    return returnObj;
                }
            }
        });
        FBB proxy = (FBB) enhancer.create();
        proxy.eat();
        proxy.sing();
        proxy.film();


    }
}
