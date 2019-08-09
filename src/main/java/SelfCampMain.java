import tdd.self.camp.FizzBuzz.GameNumber;

/**
 * @author Nut
 * @date 2019/8/8 10:53 PM
 */
public class SelfCampMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new GameNumber(i).say());
        }

    }
}
