package tdd.self.camp.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alis
 * @date 2019/9/5 2:05 PM
 * @description 隔了两周，再回来练习fizzbuzz，居然花了 14分钟，主要阻断是再重构代码的步骤上，
 * 重构代码花了比较多时间在思考哪部分代码需要抽取，这也是几次重构代码是参考课程中的写法，
 * 这部分自己独立思考的地方很少，导致重新写的时候，还需要再去思考如何重构;
 * 针对这个问题，在需要重构代码的时候，能改进的是对重构代码的坏味道快速识别，能快速识别哪些代码需要重构，哪些代码有坏味道，
 */
public class GameNumberRescueD1 {
    @Test
    public void say_one() {
        Assert.assertTrue("1".equals(GameRescue.say(1)));
    }

    @Test
    public void say_three() {
        Assert.assertTrue("fizz".equals(GameRescue.say(3)));
    }

    @Test
    public void say_five() {
        Assert.assertTrue("buzz".equals(GameRescue.say(5)));
    }

    @Test
    public void say_three_five() {
        Assert.assertTrue("fizzbuzz".equals(GameRescue.say(15)));
    }
}
