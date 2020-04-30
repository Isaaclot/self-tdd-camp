package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 00:56:00 start
 * @author liangqian0723@gmail.com
 * @since 2020/5/1 12:54 AM
 */
public class FizzBuzzTest {

    @Test
    public void test_say_fizz(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.say(3), is("fizz"));
    }

    @Test
    public void test_say_buzz(){
        FizzBuzzGame ga = new FizzBuzzGame();
        assertThat(ga.say(5), is("buzz"));
    }

    @Test
    public void test_say_fizz_buzz(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.say(15), is("fizzbuzz"));
    }

    @Test
    public void test_say_num_1(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.say(1), is("1"));
    }

    @Test
    public void test_say_num_6_fizz(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.say(6), is("fizz"));
    }

    @Test
    public void test_say_num_10_buzz(){
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat(game.say(10), is("buzz"));
    }

}
