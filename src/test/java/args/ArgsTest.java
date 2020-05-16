package args;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/14 8:12 AM
 */

public class ArgsTest {
    private Args args;

    @Before
    public void setUp() {
        String[] commandText = {"-l", "true", "-p", "8080", "-d", "/usr/logs"};
        String schemeText = "l:bool,p:int,d:string";
        args = new Args(new Scheme(schemeText), commandText);
    }

    @Test
    public void test_args_creator_out_of_string() {
        setUp();
        assertThat(args.size(), is(3));
    }

    @Test
    public void should_find_value_by_flag(){
        assertThat(args.specOf("l"), is(true));
        assertThat(args.specOf("p"), is(8080));
        assertThat(args.specOf("d"), is("/usr/logs"));

    }


}
