package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 1. 读取命令格式
 * 2. 解析命令格式
 * 3. 解析异常参数默认值
 * 4. 解析参数
 * 5. 解析正常场景的参数
 * 6. 解析异常场景的参数：负数、缺省值、正常场景
 *
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 8:50 AM
 */
public class ArgumentsTest {

    @Test
    public void should_create_arguments_by_scheme_text_and_args_string() {
        // 解析参数格式
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        // 解析输入参数
        String[] args = {"-l", "true", "-p", "8080", "-d", "/usr/logs"};
        Arguments arguments = new Arguments(schemes, args);
        assertThat(arguments.get("l"), is(true));
        assertThat(arguments.get("p"), is(8080));
        assertThat(arguments.get("d"), is("/usr/logs"));
    }

    @Test
    public void should_get_default_value_by_flag() {
        // 解析参数格式
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        // 解析输入参数
        String[] args = {"-l", "-p", "-d", "/usr/logs"};
        Arguments arguments = new Arguments(schemes, args);
        assertThat(arguments.get("l"), is(false));
        assertThat(arguments.get("p"), is(0));
        assertThat(arguments.get("d"), is("/usr/logs"));
    }

    @Test
    public void should_get_negative_int_value_by_flag() {
        // 解析参数格式
        String schemeText = "l:bool,p:int,d:string";
        Schemes schemes = new Schemes(schemeText);
        // 解析输入参数
        String[] args = {"-l", "-p", "-9", "-d", "/usr/logs"};
        Arguments arguments = new Arguments(schemes, args);
        assertThat(arguments.get("l"), is(false));
        assertThat(arguments.get("p"), is(-9));
        assertThat(arguments.get("d"), is("/usr/logs"));
    }

}
