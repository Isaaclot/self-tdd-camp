package tdd.self.camp.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * 任务三 重新实现一次fizzbuzz；先任务拆解，输出任务清单，计时编码
 * 1. 任务拆解
 * a. test case(测试数据分类)
 * 能被3整除的数  返回fizz
 * 能被5整除的数  返回buzz
 * 能被15整除的数 返回fizzbuzz
 * 其他数据，直接返回输入值
 * b. 通过test case的红蓝验证，一条一条实现逻辑并通过验证
 * 编码实现 --> 耗时 6分28秒
 * 编码过程：将单元测试用力罗列出来(command + D复制修改) -> 创建类和方法 --> 跑test case 红蓝测试，一条一条逻辑的通过 实现编码逻辑
 * 本次测试，使用了6分半钟，感觉自己受限的地方是在移动光标去修改复制好的test case，不用触控板之后，使用方向键移动光标去修改，会慢一点
 * 而且在需求分析阶段，已经将需要进行测试点罗列好，所以在编写单元测试的时候，直接进行复制修改，需要修改方法名，输入参数。验证参数
 * 写完单元测试，开始跑red-green，一条一条的通过
 * 再思考一层，如果克服了手速的话，自己还能快多少？
 *
 * @author Nut
 * @date 2019/8/11 10:22 PM
 */
public class GameNumberTask3Test {

    @Test
    public void tese_case_normal_number() {
        Assert.assertThat(new GameNumberT3().say(1), is("1"));
    }

    @Test
    public void tese_case_three() {
        Assert.assertThat(new GameNumberT3().say(3), is("fizz"));
    }

    @Test
    public void tese_case_five() {
        Assert.assertThat(new GameNumberT3().say(5), is("buzz"));
    }

    @Test
    public void tese_case_fifteen() {
        Assert.assertThat(new GameNumberT3().say(15), is("fizzbuzz"));
    }
}
