package tdd.self.camp.FizzBuzz;

/**
 * @author Nut
 * @date 2019/8/11 4:58 PM
 */
public class GameNumT2 {

    private int input;

    public GameNumT2(int input) {
        this.input = input;
    }

    public String say() {
        if (isDiviable(3) && isDiviable(5)) {
            return "fizzbuzz";
        }
        int validateVal = 3;
        if (isDiviable(validateVal)) {
            return "fizz";
        }
        if (isDiviable(5)) {
            return "buzz";
        }

        return input + "";
    }

    private boolean isDiviable(int validateVal) {
        return input % validateVal == 0;
    }
}
