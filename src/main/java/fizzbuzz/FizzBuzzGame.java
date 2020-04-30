package fizzbuzz;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/1 12:56 AM
 */
public class FizzBuzzGame {
    private final static String fizz = "fizz";
    private final static String buzz = "buzz";

    public String say(int num) {
        if (isDivive(num, 5) && isDivive(num, 3)) return fizz + buzz;
        if (isDivive(num, 3) || containTarget(num, 3)) {
            return fizz;
        }
        if (isDivive(num, 5) || containTarget(num, 5)) {
            return buzz;
        }
        return "" + num;
    }

    private boolean containTarget(int num, int target) {
        return String.valueOf(num).contains(target + "");
    }

    private boolean isDivive(int num, int i) {
        return num % i == 0;
    }
}
