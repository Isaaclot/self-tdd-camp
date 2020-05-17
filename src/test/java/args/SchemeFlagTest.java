package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:13 AM
 */
public class SchemeFlagTest {

    @Test
    public void should_create_scheme_flag_by_2_params(){
        SchemeFlag schemeFlag = new SchemeFlag("l","bool");
        assertThat(schemeFlag.getFlag(), is("l"));
        assertThat(schemeFlag.getType(), is("bool"));
    }

    @Test
    public void should_parse_of_by_value(){
        SchemeFlag schemeFlag = new SchemeFlag("l","bool");
        assertThat(schemeFlag.parseOf("true"), is(true));
    }

    @Test
    public void should_parse_of_by_default_bool_value(){
        SchemeFlag schemeFlag = new SchemeFlag("l","bool");
        assertThat(schemeFlag.parseOf(""), is(false));
    }

    @Test
    public void should_parse_of_by_default_int_value(){
        SchemeFlag schemeFlag = new SchemeFlag("p","int");
        assertThat(schemeFlag.parseOf(""), is(0));
    }

}