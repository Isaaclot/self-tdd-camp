package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @since 2020/5/9 11:54 PM
 */
public class SchemeTest {
    @Test
    public void test_scheme_default_log() {
        Scheme scheme = new Scheme("l", false);
        assertThat(scheme.value, is(false));
    }

    @Test
    public void test_scheme_port_int() {
        Scheme scheme = new Scheme("p", 8080);
        assertThat(scheme.value, is(8080));
    }

    @Test
    public void test_scheme_directory_path_str() {
        Scheme scheme = new Scheme("d", "/usr/logs");
        assertThat(scheme.value, is("/usr/logs"));
    }

}
