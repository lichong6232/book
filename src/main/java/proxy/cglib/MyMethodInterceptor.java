package proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:08 2019/2/12
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后");
        return object;
    }
}
