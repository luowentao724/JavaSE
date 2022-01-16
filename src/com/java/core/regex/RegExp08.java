package com.java.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mr.luo
 * @version 1.0
 * 演示非捕获分组, 语法比较奇怪
 */
public class RegExp08 {
    public static void main(String[] args) {

        String content = "helloMr.luo教育 jackMr.luo老师 Mr.luo同学helloMr.luo学生";

//        找到 Mr.luo教育 、Mr.luo老师、Mr.luo同学 子字符串
        //String regStr = "Mr.luo教育|Mr.luo老师|Mr.luo同学";
        //上面的写法可以等价非捕获分组, 注意：不能 matcher.group(1)
        //String regStr = "Mr.luo(?:教育|老师|同学)";

        //找到 Mr.luo 这个关键字,但是要求只是查找Mr.luo教育和 Mr.luo老师 中包含有的Mr.luo
        //下面也是非捕获分组，不能使用 matcher.group(1)
        //String regStr = "Mr.luo(?=教育|老师)";

        //找到 Mr.luo 这个关键字,但是要求只是查找 不是 (Mr.luo教育 和 Mr.luo老师) 中包含有的Mr.luo
        //下面也是非捕获分组，不能使用 matcher.group(1)
        String regStr = "Mr.luo(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }


    }
}
