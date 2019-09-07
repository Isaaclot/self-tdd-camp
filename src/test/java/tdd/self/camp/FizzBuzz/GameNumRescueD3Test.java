package tdd.self.camp.FizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/9/8 11:12 AM
 * @description 参数化测试 4分51秒，凭着记忆去开始，花了点时间在复习之前写的注解用法上
 * 本次连续fizzbuzz，使用参数化测试assertJ，并重新去记忆了这两个参数化测试的注解
 * @PamameterizedTest 和 @CsvSource
 */
public class GameNumRescueD3Test {

    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,'1'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'"
    })
    public void test_input_should_return(int i, String res) {
        assertThat(GameNumRescueD3.say(i), is(res));
    }
}
