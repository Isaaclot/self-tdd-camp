package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 12:49 AM
 */
public class ArgumentTest {

    @Test
    public void should_create_argument_from_string(){
        Argument arg = new Argument("-l","true");
        assertThat(arg.getFlag(), is("l"));
        assertThat(arg.getRawValue(), is("true"));
    }

    @Test
    public void should_get_String_from_arg(){
        Argument arg = new Argument("-d","/usr/logs");
        assertThat(arg.getFlag(), is("d"));
        assertThat(arg.getRawValue(), is("/usr/logs"));
    }

}