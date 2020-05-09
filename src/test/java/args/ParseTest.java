package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 12:01 AM
 */
public class ParseTest {
    @Test
    public void test_log_true() {
        Parse parse = new Parse("-l");
        assertThat(parse.schemeMap.get("l").flag, is("l"));
        assertThat(parse.schemeMap.get("l").value, is(false));
    }

    @Test
    public void test_port_8080() {
        Parse parse = new Parse("-p 8080");
        assertThat(parse.schemeMap.get("p").flag, is("p"));
        assertThat(parse.schemeMap.get("p").value, is(8080));
    }

    @Test
    public void test_scheme_d_path() {
        Parse parse = new Parse("-d /usr/logs");
        assertThat(parse.schemeMap.get("d").flag, is("d"));
        assertThat(parse.schemeMap.get("d").value, is("/usr/logs"));
    }

    @Test
    public void test_d_p_l() {
        Parse parse = new Parse("-l -p 8080 -d /usr/logs");

        assertThat(parse.schemeMap.get("l").flag, is("l"));
        assertThat(parse.schemeMap.get("l").value, is(false));

        assertThat(parse.schemeMap.get("p").flag, is("p"));
        assertThat(parse.schemeMap.get("p").value, is(8080));

        assertThat(parse.schemeMap.get("d").flag, is("d"));
        assertThat(parse.schemeMap.get("d").value, is("/usr/logs"));
    }
}
