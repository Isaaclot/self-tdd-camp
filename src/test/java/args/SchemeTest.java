package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/13 7:25 AM
 */
public class SchemeTest {
    @Test
    public void test_l_true() {
        Scheme scheme = new Scheme("l:bool");
        assertThat(scheme.get("bool", "true"), is(true));
        assertThat(scheme.get("bool", ""), is(false));
    }

    @Test
    public void test_p_int() {
        Scheme scheme = new Scheme("p:int");
        assertThat(scheme.get("int", "3"), is(3));
        assertThat(scheme.get("int", "-9"), is(-9));
    }

    @Test
    public void test_w_int() {
        Scheme scheme = new Scheme("w:int");
        assertThat(scheme.get("int", "200"), is(200));
        assertThat(scheme.get("int", "-9"), is(-9));
    }

    @Test
    public void test_schemes() {
        Scheme scheme = new Scheme("l:bool,p:int,d:string");
        assertThat(scheme.get("int", "3"), is(3));
        assertThat(scheme.get("int", "-9"), is(-9));

        assertThat(scheme.get("bool", "true"), is(true));
        assertThat(scheme.get("bool", ""), is(false));

        assertThat(scheme.get("string", "/usr/logs"), is("/usr/logs"));
    }

}
