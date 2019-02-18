package proxy.cglib;

import proxy.jdk.*;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:07 2019/2/12
 */
public class UserService {


    public proxy.jdk.User getUserById(Integer id) {

        return new proxy.jdk.User(id);
    }

    public void delete(Integer id) {
        System.out.println("删除用户："+id);
    }
}
