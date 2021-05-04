package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2021/5/4
 */
public class FzBaseTest {
    @Test
    public void test_given_3_then_fizz() {
        FzBase fz = new FzBase();
        assertThat(fz.say(3), is("fizz"));
    }

    @Test
    public void test_given_5_then_buzz() {
        FzBase fz = new FzBase();
        assertThat(fz.say(5), is("buzz"));
    }

    @Test
    public void test_given_6_then_fizz() {
        FzBase fz = new FzBase();
        assertThat(fz.say(6), is("fizz"));
    }

    @Test
    public void test_given_10_then_buzz() {
        FzBase fz = new FzBase();
        assertThat(fz.say(10), is("buzz"));
    }

    @Test
    public void test_given_15_then_fizzbuzz() {
        FzBase fz = new FzBase();
        assertThat(fz.say(15), is("fizzbuzz"));
    }

    @Test
    public void test_given_1_then_1() {
        FzBase fz = new FzBase();
        assertThat(fz.say(1), is("1"));
    }
}
