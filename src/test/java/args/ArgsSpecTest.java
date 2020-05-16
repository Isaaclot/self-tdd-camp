package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/14 8:23 AM
 */
public class ArgsSpecTest {
    @Test
    public void test_create_args_spec(){
        ArgsSpec argsSpec = new ArgsSpec("l", new Scheme("l:bool"));
        assertThat(argsSpec.getFlag(), is("l"));
    }



}
