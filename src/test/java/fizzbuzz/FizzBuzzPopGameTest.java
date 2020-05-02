package fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/2 11:33 PM
 */
public class FizzBuzzPopGameTest {

    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,'1'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'"
    })
    void test_fizz_buzz(int input, String res) {
        assertThat(new FizzBuzzPopGame(input).call(), is(res));
    }
}
