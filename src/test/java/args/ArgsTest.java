package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 9:33 AM
 */
public class ArgsTest {
    @Test
    public void test_args_normal_command() {
        Args args = new Args("l:bool,p:int,d:string", "-l true -p 8080 -d /usr/logs");
        assertThat(args.get("l"), is(true));
        assertThat(args.get("p"), is(8080));
        assertThat(args.get("d"), is("/usr/logs"));
    }

    @Test
    public void test_args_default_command() {
        Args args = new Args("l:bool,p:int,d:string", "-l -p 8080 -d /usr/logs");
        assertThat(args.get("l"), is(false));
        assertThat(args.get("p"), is(8080));
        assertThat(args.get("d"), is("/usr/logs"));
    }

    @Test
    public void test_args_negative_port_command() {
        Args args = new Args("l:bool,p:int,d:string", "-l false -p -9 -d /usr/logs");
        assertThat(args.get("l"), is(false));
        assertThat(args.get("p"), is(-9));
        assertThat(args.get("d"), is("/usr/logs"));
    }

}
