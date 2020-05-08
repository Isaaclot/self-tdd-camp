package measure;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 1英尺(foot) = 12 英寸 inch
 * 3英尺(foot)=1码
 * 12英寸(inch)=1英尺(foot)
 * 36英寸(inch)=1码
 * 1码=36英寸(inch)
 * 1码(yard) = 3 英尺(foot)
 *
 * @author liangqian0723@gmail.com
 * @since 2020/5/6 10:32 AM
 */
public class MeasureUnitTest {

    @Test
    public void test_given_1_foot_return_12_inch() {
        MeasureUnit unit = new MeasureUnit(1, "foot");
        assertThat(unit.parse("inch"), is(12));
    }

    @Test
    public void test_given_3_foot_return_1_yard() {
        MeasureUnit unit = new MeasureUnit(3, "foot");
        assertThat(unit.parse("yard"), is(1));
    }

    @Test
    public void test_given_12_inch_return_1_foot() {
        MeasureUnit unit = new MeasureUnit(12, "inch");
        assertThat(unit.parse("foot"), is(1));
    }

    @Test
    public void test_given_36_inch_return_1_yard() {
        MeasureUnit unit = new MeasureUnit(36, "inch");
        assertThat(unit.parse("yard"), is(1));
    }

    @Test
    public void test_given_1_yard_return_36_inch() {
        MeasureUnit unit = new MeasureUnit(1, "yard");
        assertThat(unit.parse("inch"), is(36));
    }

    @Test
    public void test_given_1_yard_return_3_foot() {
        MeasureUnit unit = new MeasureUnit(1, "yard");
        assertThat(unit.parse("foot"), is(3));
    }


}
