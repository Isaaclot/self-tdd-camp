package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:29 AM
 */
public class ArgumentSpecTest {
    @Test
    public void should_create_spec_by_flag_raw(){
        ArgumentSpec spec =new ArgumentSpec("l", "true");
        assertNotNull(spec);
    }

    @Test
    public void should_get_rawValue_by_flag(){
        ArgumentSpec spec =new ArgumentSpec("l", "true");

        assertThat(spec.getRawValue(), is("true"));
    }

}