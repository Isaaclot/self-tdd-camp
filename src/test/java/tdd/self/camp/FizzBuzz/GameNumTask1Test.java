package tdd.self.camp.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * 任务一：任务前的热身
 * 耗时：18分28秒
 * 代码质量如何：
 * 1. 代码中有魔法值没有抽取出来
 * 2. 由于这次输入使用的是字符串输入，在实现方法中，字符串转换没有做转换异常校验
 * TDD方式释放顺畅:
 * 1. 编写单元测试的时候，出现单元测试代码重构异常，在写完了 "1" , "2" 的单元测试之后，
 * 开始重构抽离重复代码，导致抽离的方法，输入值和验证值都用了同一个变量
 * 实际做的步骤，和一开始拆分的任务是否相同？🌟
 * 1. 这次没有做任务拆分，由于之前看开营直播课程的时候，跟着老师做了一次；
 * 2. 虽然看到了提示，需要花十分钟将任务拆分，但是并没有去做，我觉得这个步骤是我必须重视的，无论之前是否做过，
 * 都需要花时间在做动手之前的思考，如果在动手过程中进行思考，那就是还没想好怎么干
 * 3. 所以，在动手编码之前，开始任务拆解是必须的过程
*
 * @author Nut
 * @date 2019/8/11 4:19 PM
 */
public class GameNumTask1Test {

    @Test
    public void printSer() {
        for (int i = 0; i < 100; i++) {
            System.out.println(new GameNumT1(i + "").toString());
        }
    }

    @Test
    public void test_one() {
        assertNum("1", "1");

    }

    @Test
    public void test_two() {
        assertNum("2", "2");
    }

    @Test
    public void test_three() {
        assertNum("3", "fizz");
    }

    @Test
    public void test_five() {
        assertNum("5", "buzz");
    }

    @Test
    public void test_five_and_three() {
        assertNum("15", "fizzBuzz");
    }

    private void assertNum(String validateNum, String assertStr) {
        Assert.assertThat(new GameNumT1(validateNum).toString(), is(assertStr));
    }

}
