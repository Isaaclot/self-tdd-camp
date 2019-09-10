package tdd.self.camp.args.ArgsMissionOneTest;

import org.junit.jupiter.api.Test;
import tdd.self.camp.args.ArgsMissionSchemeOne;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/9/8 11:21 PM
 * @description 开始时间 耗时30分钟
 * 本次练习属于第一次练习，写好拆解任务之后，先列出待测试点，再去实现逻辑；
 */
class ArgsMissionOneTest {

    ArgsMissionSchemeOne argsMissionSchemeOne;

    private static final String InputCommand = "-l -p 8080 -d /usr/logs";


    @Test
    void get_logging_scheme_key_value() {
        validateScheme("true", getArgsMissionSchemeOne(InputCommand).getVal("-l"));
    }

    @Test
    void get_port_scheme_value() {
        validateScheme("8080", getArgsMissionSchemeOne(InputCommand).getVal("-p"));
    }

    @Test
    void get_dir_scheme_path() {
        validateScheme("/usr/logs", getArgsMissionSchemeOne(InputCommand).getVal("-d"));
    }

    @Test
    void get_scheme_map_given_command() {
        Map<String, String> map = getArgsMissionSchemeOne(InputCommand).getScheme();
        assertThat(map.size(), is(3));
        validateScheme("true", map.get("-l"));
        validateScheme("/usr/logs", map.get("-d"));
        validateScheme("8080", map.get("-p"));
    }


    private synchronized ArgsMissionSchemeOne getArgsMissionSchemeOne(String inputCommand) {
        if (argsMissionSchemeOne == null) {
            synchronized (this) {
                if (argsMissionSchemeOne == null) {
                    argsMissionSchemeOne = new ArgsMissionSchemeOne(inputCommand);
                }
            }
        }
        return argsMissionSchemeOne;
    }

    private void validateScheme(String aTrue, String val) {
        assertThat(val, is(aTrue));
    }

}
