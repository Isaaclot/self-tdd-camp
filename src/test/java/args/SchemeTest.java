package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 9:39 AM
 */
public class SchemeTest {
    @Test
    public void test_scheme_log_bool() {
        Scheme scheme = new Scheme("l:bool");
        assertThat(scheme.getValue("l", "true"), is(Boolean.TRUE));
        assertThat(scheme.getValue("l", "false"), is(Boolean.FALSE));
    }

    @Test
    public void test_scheme_port_int() {
        Scheme scheme = new Scheme("p:int");
        assertThat(scheme.getValue("p", "1"), is(1));
        assertThat(scheme.getValue("p", "-9"), is(-9));
    }

    @Test
    public void test_scheme_directory_path() {
        Scheme scheme = new Scheme("d:string");
        assertThat(scheme.getValue("d", "/usr/logs"), is("/usr/logs"));
    }
}
