package fizzbuzz;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/1 4:15 PM
 */
public class NumberPop {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String EMPTY_STR = "";

    public String say(int number) {
        String res = EMPTY_STR;
        res += popFizz(number);
        res += popBuzz(number);
        if (res.length() == 0) res += number;
        return res;
    }

    private String popBuzz(int number) {
        if (isDivision(number, 5) || isContains(number, 5))
            return BUZZ;
        return EMPTY_STR;
    }

    private String popFizz(int number) {
        if (isDivision(number, 3) || isContains(number, 3))
            return FIZZ;
        return EMPTY_STR;
    }

    private boolean isDivision(int number, int i) {
        return number % i == 0;
    }

    private boolean isContains(int number, int subNum) {
        return String.valueOf(number).contains(EMPTY_STR + subNum);
    }
}
