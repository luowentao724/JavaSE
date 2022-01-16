package com.java.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: 正则表达式初体验，它能帮我们做什么
 * @author Mr.luo
 * @date 2022/1/15 10:34 下午
 * @version 1.0
 */
public class Regexp01 {

    static Pattern compile = Pattern.compile("[a-zA-Z]+");

    public static void main(String[] args) {
        String content = "全球权威IT研究与顾问咨询公司高纳德（Gartner）2020年发布的" +
                "《自然语言处理技术成熟度曲线（Hype Cycle for Natural Language Technologies）》" +
                "报告中，百度被列为神经网络机器翻译“标杆机构（sample vender）”，" +
                "是机器翻译领域中国唯一上榜单位。";
        // 先创建一个Pattern对象，模式对象，正则表达式 , 匹配所有英文字母
        // 2. 创建一个匹配器对象
        Matcher matcher = compile.matcher(content);
        // 3. 开始循环匹配
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
