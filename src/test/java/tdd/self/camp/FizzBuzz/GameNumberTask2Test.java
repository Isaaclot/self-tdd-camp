package tdd.self.camp.FizzBuzz;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;

/**
 * 任务二：整理工作环境
 * 由于任务一超过了15分钟，所以这次还是一口气做完了一次fizzbuzz
 * 耗时：16分31秒(包含模仿视频中使用参数化校验的方式去编写单元测试，包含了junit5的引入和注解的使用学习)
 * 本次在编码的过程中没有使用鼠标
 * 使用到的快捷键：
 * 1. 抽取变量 option + command + v
 * 2. 抽取公共方法 option + command + m
 * 3. 优化中间变量 option + command + n
 * 4. 整行复制    command + d
 * 5. 运行测试类  control + shift + r
 * 6. 从调用方法跳转实现方法 option + command + b
 * 7. 生成构造函数 option + enter
 * 8. 光标行首行尾跳转 command + left/right
 * 今天学习到的快捷键
 * 1. option + command + t 将选中方法加入到某个方法块中
 * 不准动鼠标的规定在什么时候感到最难遵守？
 * 1. 对于页面篇幅比较长的类，通过方向键切换光标的时候，很慢
 * 2. 后来去网上查了有没有这个快捷键，发现idea提供的都是代码方法追踪的快捷键，如果你要一行一行代码读，还是需要方向键移动光标
 * 第二遍做这道题目，是否还有卡壳的情况？为什么？
 * 1. 这是我第三次做这个题目了，做题的时候，没有出现卡壳的时候，只是在熟悉使用参数化单元测试的时候，需要卡壳花时间去学习这些注解的方法
 * 2. 为什么做题不卡壳？
 * a. 之前做了三次题目，对这道题需要做什么，有什么逻辑，有那些地方需要进行单元测试，已经很清楚
 *
 * @author Nut
 * @date 2019/8/11 4:51 PM
 */
public class GameNumberTask2Test {

    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,'1'",
            "3,'fizz'",
            "5,'buzz'",
            "15,'fizzbuzz'"
    })
    void test(int input, String res) {
        Assert.assertThat(new GameNumT2(input).say(), is(res));

    }


}
