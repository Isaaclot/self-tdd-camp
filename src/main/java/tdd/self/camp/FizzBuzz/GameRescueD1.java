package tdd.self.camp.FizzBuzz;

/**
 * @author alis
 * @date 2019/9/5 2:06 PM
 * @description
 */
public class GameRescueD1 {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static String say(int i) {
        if (isDividable(i, 3) && isDividable(i, 5)) {
            return FIZZ + BUZZ;
        }
        if (isDividable(i, 3)) {
            return FIZZ;
        }
        if (isDividable(i, 5)) {
            return BUZZ;
        }

        return i + "";
    }

    private static boolean isDividable(int i, int i1) {
        return i % i1 == 0;
    }
}
