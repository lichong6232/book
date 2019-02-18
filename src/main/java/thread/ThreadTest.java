package thread;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:30 2019/2/17
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread("1");
        t.join();
    }
}
