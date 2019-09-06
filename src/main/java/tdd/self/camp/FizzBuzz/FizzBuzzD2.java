package tdd.self.camp.FizzBuzz;

/**
 * @author alis
 * @date 2019/9/6 5:35 PM
 * @description
 */
public class FizzBuzzD2 {
    public static String say(int i) {
        if (isDivalable(i, 3) && isDivalable(i, 5)) {
            return "fizzbuzz";
        }
        if (isDivalable(i, 3)) {
            return "fizz";
        }
        if (isDivalable(i, 5)) {
            return "buzz";
        }

        return i + "";
    }

    private static boolean isDivalable(int i, int i1) {
        return i % i1 == 0;
    }
}
