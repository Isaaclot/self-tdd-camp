package fizzbuzz;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/2 11:38 PM
 */
public class FizzBuzzPopGame {
    private int input;

    public FizzBuzzPopGame(int input) {
        this.input = input;
    }

    public String call() {
        if (isDivision(3) && isDivision(5)) return "fizzbuzz";
        if (isDivision(3)) return "fizz";
        if (isDivision(5)) return "buzz";
        return "" + input;
    }

    private boolean isDivision(int i) {
        return input % i == 0;
    }
}
