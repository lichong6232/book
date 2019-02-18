package proxy.jdk;

/**
 * @Author: lichong04
 * @Date: Created in 下午1:51 2019/2/12
 */
public interface UserService {

    User getUserById(Integer id);

    void delete(Integer id);
}
