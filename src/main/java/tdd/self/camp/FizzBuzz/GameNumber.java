package tdd.self.camp.FizzBuzz;

/**
 * @author Nut
 * @date 2019/8/8 10:55 PM
 */
public class GameNumber {

    private int number;

    public GameNumber(int i) {

        number = i;
    }

    public String say() {
        if (isDiviable(15) ) {
            return "fizzbuzz";
        }
        if (isDiviable(3) || isContains("3")) {
            return "fizz";
        }
        if (isDiviable(5) || isContains("5"))  {
            return "buzz";
        }
        return number + "";
    }

    private boolean isContains(String containVal) {
        return (number+"").contains(containVal);
    }

    private boolean isDiviable(int base) {
        return number % base == 0;
    }
}
