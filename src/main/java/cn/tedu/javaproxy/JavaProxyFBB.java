package cn.tedu.javaproxy;

import cn.tedu.staticproxy.FBB;
import cn.tedu.staticproxy.SJSkill;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author XiangRui
 * @create 2020-03-07 9:11 下午
 */
//java动态代理
//java动态代理方式 生成fbb的代理者
/**
 * classLoader:用来生成代理者类的类加载器，通常可以传入被代理者类的类加载器
 * interfaces: 要求生成的代理者实现的接口们，通常就是实现和被代理者相同的接口，保证具有和被代理者相
 同的方法
 * invocationHandler: 用来设定回调函数的回调接口，使用者需要写一个类实现此接口，从而实现其中的
 invoke方法，
 * 在其中编写代码处理代理者调用方法时的回调过程，通常在这里调用真正对象身上的方法，并且在方法之前
 或之后做额外操作。 */
public class JavaProxyFBB {
    @Test
    public void test01(){
         final FBB fbb= new FBB();
        SJSkill proxy = (SJSkill) Proxy.newProxyInstance(FBB.class.getClassLoader(), FBB.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("film".equals(method.getName())){
                    System.out.println("说什么都不拍");
                    return null;
                }
                else {
                    System.out.println("检查权限...");
                    Object returnObj = method.invoke(fbb, args);
                    System.out.println("记录日志");
                    return returnObj;

                }
            }
        });
        proxy.eat();
        proxy.sing();
        proxy.film();
    }
}
