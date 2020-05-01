package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/1 8:59 AM
 */
public class NumberGameTest {
    @Test
    public void test_say_1_return_1() {
        NumberGame game = new NumberGame();
        assertThat(game.say(1), is("1"));
    }

    @Test
    public void test_say_3_fizz() {
        NumberGame ga = new NumberGame();
        assertThat(ga.say(3), is("fizz"));
    }

    @Test
    public void test_say_5_buzz() {
        NumberGame game = new NumberGame();
        assertThat(game.say(5), is("buzz"));
    }

    @Test
    public void test_test_z5_fizzbuzz() {
        NumberGame game = new NumberGame();
        assertThat(game.say(15), is("fizzbuzz"));
    }

    @Test
    public void test_say_13_fizz() {
        NumberGame ga = new NumberGame();
        assertThat(ga.say(13), is("fizz"));
    }

    @Test
    public void test_say_52_buzz() {
        NumberGame game = new NumberGame();
        assertThat(game.say(52), is("buzz"));
    }

    @Test
    public void test_say_53_fizzbuzz() {
        NumberGame g = new NumberGame();
        assertThat(g.say(53), is("fizzbuzz"));
    }
}
