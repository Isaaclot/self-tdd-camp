package tdd.self.camp.FizzBuzz;

/**
 * @author alis
 * @date 2019/9/6 5:49 PM
 * @description
 */
public class FizzBuzzD2R2 {
    public static String say(int i) {
        if (isDivi(i, 3) && isDivi(i, 5)) {
            return "fizzBuzz";
        }
        if (isDivi(i, 3)) {
            return "fizz";
        }
        int i1 = 5;
        if (isDivi(i, i1)) {
            return "buzz";
        }
        return i + "";
    }

    private static boolean isDivi(int i, int i1) {
        return i % i1 == 0;
    }
}
