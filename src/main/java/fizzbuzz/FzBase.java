package fizzbuzz;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2021/5/4
 */
public class FzBase {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String say(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return FIZZ + BUZZ;
        } else if (num % 3 == 0) {
            return FIZZ;
        } else if (num % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(num);
    }
}
