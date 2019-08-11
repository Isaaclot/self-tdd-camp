package tdd.self.camp.FizzBuzz;

/**
 * @author Nut
 * @date 2019/8/11 10:31 PM
 */
public class GameNumberT3 {
    public String say(int inputNum) {
        if (isDiviable(inputNum, 3) && isDiviable(inputNum, 5)) {
            return "fizzbuzz";
        }
        if (isDiviable(inputNum, 3)) {
            return "fizz";
        }
        if (isDiviable(inputNum, 5)) {
            return "buzz";
        }

        return inputNum + "";
    }

    private boolean isDiviable(int inputNum, int validateNum) {
        return inputNum % validateNum == 0;
    }
}
