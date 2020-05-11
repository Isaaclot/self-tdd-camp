package args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 【作业一补打卡-Args初体验】
 * 感受：用时40分钟，其中拆解任务花了十分钟
 * 代码质量：坏味道很多，最严重的是魔法数字很多
 * TDD顺畅：TDD的方式还算顺畅，完成一部分功能，运行一次全局测试
 * 实际做的步骤，和一开始拆分的任务是否相同？与一开始拆分的任务有所不同，在现在回想一下，
 * 在Parse中的map封装scheme似乎没必要，造成了scheme中的flag是冗余字段
 *
 * @author liangqian0723@gmail.com
 * @since 2020/5/10 12:01 AM
 */
public class ParseTest {
    @Test
    public void test_log_true() {
        Parse parse = new Parse("-l");
        assertThat(parse.schemeMap.get("l").flag, is("l"));
        assertThat(parse.schemeMap.get("l").value, is(false));
    }
    @Test
    public void test_port_8080() {
        Parse parse = new Parse("-p 8080");
        assertThat(parse.schemeMap.get("p").flag, is("p"));
        assertThat(parse.schemeMap.get("p").value, is(8080));
    }
    @Test
    public void test_scheme_d_path() {
        Parse parse = new Parse("-d /usr/logs");
        assertThat(parse.schemeMap.get("d").flag, is("d"));
        assertThat(parse.schemeMap.get("d").value, is("/usr/logs"));
    }
    @Test
    public void test_d_p_l() {
        Parse parse = new Parse("-l -p 8080 -d /usr/logs");
        assertThat(parse.schemeMap.get("l").flag, is("l"));
        assertThat(parse.schemeMap.get("l").value, is(false));
        assertThat(parse.schemeMap.get("p").flag, is("p"));
        assertThat(parse.schemeMap.get("p").value, is(8080));
        assertThat(parse.schemeMap.get("d").flag, is("d"));
        assertThat(parse.schemeMap.get("d").value, is("/usr/logs"));
    }
}
