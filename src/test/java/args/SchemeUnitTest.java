package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/13 8:02 AM
 */
public class SchemeUnitTest {
    @Test
    public void test_flag_bool() {
        SchemeUnit schemeUnit = new SchemeUnit("bool");
        assertThat(schemeUnit.getDefault(), is(false));
        assertThat(schemeUnit.getType(), is("bool"));
    }

    @Test
    public void test_flag_int() {
        SchemeUnit schemeUnit = new SchemeUnit("int");
        assertThat(schemeUnit.getDefault(), is(0));
        assertThat(schemeUnit.getType(), is("int"));
    }

    @Test
    public void test_flag_string() {
        SchemeUnit schemeUnit = new SchemeUnit("string");
        assertThat(schemeUnit.getDefault(), is(""));
        assertThat(schemeUnit.getType(), is("string"));
    }

    @Test
    public void test_parse_value(){
        SchemeUnit schemeUnit = new SchemeUnit("bool");
        assertThat(schemeUnit.parse("true"), is(Boolean.TRUE));
    }
}
