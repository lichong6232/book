package proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;

/**
 * @Author: lichong04
 * @Date: Created in 下午1:57 2019/2/12
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        DynamicProxy dynamicProxy = new DynamicProxy(new UserServiceImpl());
//        UserService userService = (UserService) dynamicProxy.getProxy();
//        userService.delete(1);


        int accessFlags = Modifier.PUBLIC | Modifier.FINAL;
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                "UserServiceProxy", new Class[]{UserService.class});
        new FileOutputStream(new File("/Users/chongli/Documents/lc/mySelfProject/book/src/main/java/proxy/jdk/UserServiceProxy.class")).write(proxyClassFile);
    }
}
