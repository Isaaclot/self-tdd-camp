package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 10:12 AM
 */
public class CommandTest {
    @Test
    public void test_normal_command() {
        Command command = new Command("-l true -p 8080 -d /usr/logs");
        assertThat(command.get("l"), is("true"));
        assertThat(command.get("p"), is("8080"));
        assertThat(command.get("d"), is("/usr/logs"));
    }

    @Test
    public void test_default_command() {
        Command command = new Command("-l -p 8080 -d /usr/logs");
        assertThat(command.get("l"), is("false"));
        assertThat(command.get("p"), is("8080"));
        assertThat(command.get("d"), is("/usr/logs"));
    }

    @Test
    public void test_negative_int_command() {
        Command command = new Command("-l -p -9 -d /usr/logs");
        assertThat(command.get("l"), is("false"));
        assertThat(command.get("p"), is("-9"));
        assertThat(command.get("d"), is("/usr/logs"));
    }
}
