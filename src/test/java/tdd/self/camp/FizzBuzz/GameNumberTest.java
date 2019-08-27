package tdd.self.camp.FizzBuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nut
 * @date 2019/8/8 11:01 PM
 */

public class GameNumberTest {

    public static final String FIZZ = "fizz";
    public static final String TWO = "2";
    public static final String ONE = "1";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void test_say_one() {
        assertGameNumber(1, ONE);
    }

    @Test
    public void test_say_two() {
        assertGameNumber(2, TWO);
    }

    @Test
    public void test_say_three() {
        assertGameNumber(3, FIZZ);
    }

    @Test
    public void test_say_five() {
        assertGameNumber(5, BUZZ);
    }

    @Test
    public void test_say_divide_by_three_five() {
        assertGameNumber(15, FIZZBUZZ);
    }

    @Test
    public void test_say_contail_three() {
        assertGameNumber(52, BUZZ);
    }

    @Test
    public void test_say_contain_five() {
        assertGameNumber(34, FIZZ);
    }


    private void assertGameNumber(int sayNumber, String exceptWord) {
        GameNumber gameNumber = new GameNumber(sayNumber);
        assertThat(gameNumber.say(), is(exceptWord));
    }


}