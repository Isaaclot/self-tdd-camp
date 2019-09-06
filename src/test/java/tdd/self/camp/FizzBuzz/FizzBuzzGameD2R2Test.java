package tdd.self.camp.FizzBuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/9/6 5:48 PM
 * @description 耗时 04分10秒 这次是一次性写完所有的testcase，再进行红绿测试，再去修复实现
 */
public class FizzBuzzGameD2R2Test {

    @Test
    public void one_one() {
        assertThat(FizzBuzzD2R2.say(1), is("1"));
    }

    @Test
    public void three_fizz() {
        assertThat(FizzBuzzD2R2.say(3), is("fizz"));
    }

    @Test
    public void five_buzz() {
        assertThat(FizzBuzzD2R2.say(5), is("buzz"));
    }

    @Test
    public void fifteen_fizzBuzz() {
        assertThat(FizzBuzzD2R2.say(15), is("fizzBuzz"));
    }
}
