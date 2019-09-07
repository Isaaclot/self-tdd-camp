package tdd.self.camp.FizzBuzz;

/**
 * @author alis
 * @date 2019/9/8 12:14 AM
 * @description
 */
public class GameNumRescueD3 {
    public static String say(int i) {
        int i1 = i;
        if (!isDiviable(i, 3) || !isDiviable(i1, 5)) {
            if (isDiviable(i, 3)) {
                return "fizz";
            }
            if (isDiviable(i, 5)) {
                return "buzz";
            }

            return "" + i;
        } else {
            return "fizzbuzz";
        }
    }

    private static boolean isDiviable(int i1, int i) {
        return i1 % i == 0;
    }
}
