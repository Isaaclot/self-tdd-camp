package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/14 8:12 AM
 */

public class ArgsTest {
    private Args args;

    String schemeText = "l:bool,p:int,d:string";

    @Test
    public void test_args_creator_out_of_string() {
        String[] commandText = {"-l", "true", "-p", "8080", "-d", "/usr/logs"};
        args = new Args(new Scheme(schemeText), commandText);
        assertThat(args.size(), is(3));
    }

    @Test
    public void should_find_value_by_flag() {
        String[] commandText = {"-l", "true", "-p", "8080", "-d", "/usr/logs"};
        args = new Args(new Scheme(schemeText), commandText);
        assertThat(args.specOf("l"), is(true));
        assertThat(args.specOf("p"), is(8080));
        assertThat(args.specOf("d"), is("/usr/logs"));
    }

    @Test
    public void should_find_default_value_by_flag() {
        String[] commandText = {"-l", "-p", "8080", "-d", "/usr/logs"};
        args = new Args(new Scheme(schemeText), commandText);

        assertThat(args.specOf("l"), is(false));
        assertThat(args.specOf("p"), is(8080));
    }
    @Test
    public void should_find_negative_value_by_flag() {
        String[] commandText = {"-l", "-p", "-9", "-d", "/usr/logs"};
        args = new Args(new Scheme(schemeText), commandText);

        assertThat(args.specOf("l"), is(false));
        assertThat(args.specOf("p"), is(-9));
    }


}
