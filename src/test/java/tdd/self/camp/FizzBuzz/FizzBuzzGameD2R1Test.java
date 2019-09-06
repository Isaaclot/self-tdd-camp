package tdd.self.camp.FizzBuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/9/6 5:34 PM
 * @description 耗时 06分11秒
 */
public class FizzBuzzGameD2R1Test {

    @Test
    public void fizz_one() {
        assertThat(FizzBuzzD2.say(1), is("1"));
    }

    @Test
    public void fizz_three() {
        assertThat(FizzBuzzD2.say(3), is("fizz"));
    }

    @Test
    public void buzz_five() {
        assertThat(FizzBuzzD2.say(5), is("buzz"));
    }

    @Test
    public void fizz_buzz_fifteen() {
        assertThat(FizzBuzzD2.say(15), is("fizzbuzz"));
    }
}
