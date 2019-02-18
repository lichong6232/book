package proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:09 2019/2/12
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/chongli/Documents/lc/mySelfProject/book/src/main/java/proxy/cglib");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MyMethodInterceptor());
        UserService userService = (UserService) enhancer.create();
        userService.delete(1);
        userService.delete(2);
        userService.getUserById(1);
        userService.getUserById(2);

    }
}
