package tdd.self.camp.FizzBuzz;

/**
 * @author Nut
 * @date 2019/8/11 4:20 PM
 */
public class GameNumT1 {
    private String numStr;

    public GameNumT1(String numStr) {
        this.numStr = numStr;
    }

    @Override
    public String toString() {
        if (isEqualsValidate("3") && isEqualsValidate("5")) {
            return "fizzBuzz";
        }
        if (isEqualsValidate("3")) {
            return "fizz";
        }
        if (isEqualsValidate("5")) {
            return "buzz";
        }
        return numStr;

    }

    private boolean isEqualsValidate(String validateStr) {
        return (Integer.valueOf(numStr) % Integer.valueOf(validateStr)) == 0;
    }
}
