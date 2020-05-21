package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @since 2020/5/22 7:08 AM
 * 拆解任务：3min
 * 重构完：2020/5/22 7:30 AM
 */
public class FizzBuzzPopTest {
    @Test
    public void should_when_1_say_1() {
        assertThat(new FizzBuzzPop(1).call(), is("1"));
    }

    @Test
    public void should_when_3_say_fizz() {
        assertThat(new FizzBuzzPop(3).call(), is("fizz"));
    }

    @Test
    public void should_when_5_say_buzz() {
        assertThat(new FizzBuzzPop(5).call(), is("buzz"));
    }

    @Test
    public void should_when_15_say_fizzbuzz() {
        assertThat(new FizzBuzzPop(15).call(), is("fizzbuzz"));
    }

    @Test
    public void should_when_13_say_fizz() {
        assertThat(new FizzBuzzPop(13).call(), is("fizz"));

    }

    @Test
    public void should_when_58_say_buzz() {
        assertThat(new FizzBuzzPop(58).call(), is("buzz"));
    }

    @Test
    public void should_when_53_say_fizz_buzz() {
        assertThat(new FizzBuzzPop(53).call(), is("fizzbuzz"));
    }
}
