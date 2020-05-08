package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/1 4:10 PM
 */
public class NumberPopTest {
    @Test
    public void test_say_number_1_return_1() {
        assertThat(new NumberPop().say(1), is("1"));
    }

    @Test
    public void test_say_3_return_fizz() {
        assertThat(new NumberPop().say(3), is("fizz"));
    }

    @Test
    public void test_say_5_return_buzz() {
        assertThat(new NumberPop().say(5), is("buzz"));
    }

    @Test
    public void test_say_15_return_fizz_buzz() {
        assertThat(new NumberPop().say(15), is("fizzbuzz"));
    }

    @Test
    public void test_say_13_return_fizz() {
        assertThat(new NumberPop().say(13), is("fizz"));
    }

    @Test
    public void test_say_59_return_buzz() {
        assertThat(new NumberPop().say(59), is("buzz"));
    }

    @Test
    public void test_say_35_return_fizz_buzz() {
        assertThat(new NumberPop().say(35), is("fizzbuzz"));
    }


}
