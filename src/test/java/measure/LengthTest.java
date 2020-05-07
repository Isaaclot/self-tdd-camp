package measure;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/7 10:53 PM
 */
public class LengthTest {
    @Test
    public void test_given_1_foot_return_12_inch() {
        assertThat(new Length(Unit.FOOT, 1), is(new Length(Unit.INCH, 12)));
    }

    @Test
    public void test_given_3_foot_return_1_yard() {
        assertThat(new Length(Unit.FOOT, 3), is(new Length(Unit.YARD, 1)));
    }

    @Test
    public void test_given_12_inch_return_1_foot() {
        assertThat(new Length(Unit.INCH, 12), is(new Length(Unit.FOOT, 1)));
    }

    @Test
    public void test_given_36_inch_return_1_yard() {
        assertThat(new Length(Unit.INCH, 36), is(new Length(Unit.YARD, 1)));
    }

    @Test
    public void test_given_1_yard_return_36_inch() {
        assertThat(new Length(Unit.YARD, 1), is(new Length(Unit.INCH, 36)));
    }

    @Test
    public void test_given_1_yard_return_3_foot() {
        assertThat(new Length(Unit.YARD, 1), is(new Length(Unit.FOOT, 3)));
    }
}
