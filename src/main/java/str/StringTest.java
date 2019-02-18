package str;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:48 2019/2/16
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("AA");
        String s2 = "AA";
        System.out.println(s2==s1.intern());
    }
}
