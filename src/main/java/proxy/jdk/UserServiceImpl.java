package proxy.jdk;

/**
 * @Author: lichong04
 * @Date: Created in 下午1:52 2019/2/12
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {

        return new User(id);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("删除用户："+id);
    }
}
