package fizzbuzz;

/**
 * 耗时：15分钟，包含了需求变更的实现
 *
 * @since 2020/5/1 8:59 AM
 */
public class NumberGame {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String NUMBER_THREE = "3";
    public static final String NUMBER_FIVE = "5";

    public String say(int num) {
        if (isDivisable(num, 5) && isDivisable(num, 3)) return FIZZ + BUZZ;
        if (isContains(num, NUMBER_THREE) && isContains(num, NUMBER_FIVE))
            return FIZZ + BUZZ;
        if (isDivisable(num, 3) || isContains(num, NUMBER_THREE)) return FIZZ;
        if (isDivisable(num, 5) || isContains(num, NUMBER_FIVE)) return BUZZ;
        return num + "";
    }

    private boolean isDivisable(int num, int i) {
        return num % i == 0;
    }

    private boolean isContains(int num, String target) {
        return String.valueOf(num).contains(target);
    }
}
