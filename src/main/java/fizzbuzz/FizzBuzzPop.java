package fizzbuzz;

/**
 * @since 2020/5/22 7:13 AM
 */
public class FizzBuzzPop {
    private final int number;

    public FizzBuzzPop(int number) {

        this.number = number;
    }

    public String call() {
        String result = "";
        result += callFb(3, "fizz");
        result += callFb(5, "buzz");
        return result.length() == 0 ? String.valueOf(number) : result;
    }

    private String callFb(int fizzVal, String fizz) {
        if (isDivisible(fizzVal) || isContains(fizzVal)) {
            return fizz;
        }
        return "";
    }

    private boolean isContains(int s) {
        return String.valueOf(number).contains(s + "");
    }

    private boolean isDivisible(int i) {
        return number % i == 0;
    }
}
