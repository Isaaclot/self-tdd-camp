package tdd.self.camp.args;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目介绍
 * 我们经常会遇到需要解析命令行参数的场景。如果没有趁手的工具，我们可以自己写一个，自己想办法处理传给main函数的参数。
 * Args是一个经典的编程练习题，复杂度与我们日常开发中接触到的需求大致相当，能很好地体现出程序员的熟练度。
 * 功能目的理解：输入字符串的命令参数，解析成合法的指令，并输出这些合法的指令
 * 任务拆解：
 * 0. 创建字典值枚举类型
 * 1. 输入命令行字符串  `-l -p 8080 -d /usr/logs` assert 判空
 * 2. 按照横线"-"分割字符串成一个数组 assert 校验数组判空
 * 3. 校验每个数组内的标记和值的准确性 assert 通过遍历对比设置好的字典值，来判断合法性
 * 4. 如果有不正确的标记值组，并给正确的提示   反馈正确的值：如果匹配到标记，值的格式不正确，则返回该标记和值的用法，如果匹配不到标记，则返回字典值中所有指令的用法
 * 5. 如果解析正确，输出这些正确的命令行 标记和值 assert 遍历并校验数据
 *
 * @author Nut
 * @date 2019/8/26 7:02 PM
 */
public class ArgsMissionSchemeOne {


    private static Map<String, String> scheme = new HashMap<>();

    public ArgsMissionSchemeOne(String command) {
        this.parseScheme(command);
    }


    public String getVal(String key) {
        return null == scheme ? "" : scheme.get(key);
    }

    public Map<String, String> getScheme() {
        return scheme;
    }

    private void parseScheme(String orCommand) {
        String[] commands = orCommand.split("-");
        for (int i = 0; i < commands.length; i++) {
            String singleCmd = commands[i];
            if (singleCmd.length() == 0) continue;
            String[] vacs = singleCmd.split(" ");
            String val = vacs.length > 1 ? vacs[1] : "true";
            scheme.put("-" + vacs[0].trim(), val.trim());
        }
    }
}


