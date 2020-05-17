package args;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:02 AM
 */
public class SchemesTest {
    @Test
    public void should_create_schemes_by_string() {
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        assertThat(schemes.size(), is(3));
    }

    @Test
    public void should_get_type_by_flag() {
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        assertThat(schemes.getType("l"), is("bool"));
        assertThat(schemes.getType("p"), is("int"));
        assertThat(schemes.getType("d"), is("string"));
    }

    @Test
    public void should_parse_value_by_flag() {
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        assertThat(schemes.parseOf("l", "true"), is(Boolean.TRUE));
        assertThat(schemes.parseOf("p", "8080"), is(8080));
        assertThat(schemes.parseOf("d", "/usr/logs"), is("/usr/logs"));
    }

}