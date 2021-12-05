package com.java.core.recursion.demo;

/**
 * @description: 递归小练习
 * @author Mr.luo
 * @date 2021/12/5 11:37 上午
 * @version 1.0
 */
public class RecursionExercise01 {

    public static void main(String[] args) {
        System.out.println("斐波那契数 = " + fibonacci(5));

        System.out.println("猴子的总桃数 = " + monkeyEatingPeach(1));
    }

    /**
     * @description: 请使用递归的方式求出斐波那契数1，1，2，3，5，8，13..给你一个整数n,求出它的值是多
     * 1. 传入的数必须大于 0
     * 2. n = 1 斐波那契数 == 1
     * 2. n = 2 斐波那契数 == 1
     * 2. n >= 3 斐波那契数 等于前两数之和
     * @param:  n 表示获取第几位斐波拉契数
     * @return: 斐波那契数
     * @author Mr.luo
     * @date: 2021/12/5 1:41 下午
     */
    public static int fibonacci(int n){
        if(n >= 1){
            if(n == 1 || n == 2){
                return 1;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        } else {
            return -1;
        }
    }

    /**
     * @description: 猴子吃桃子问题∶
     * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。
     * 当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。问题∶最初共多少个桃子?
     * 思路分析：已知条件 ： 每天吃一半 再多吃 一个 ， 再第十天的时候只有一个桃子了
     * 逆向推导：
     * 第十天 day = 1 个
     * 第九天 day = (第十天 + 1) * 2
     * 第八天 day = (第九天 + 1) * 2
     * 规律：当天的桃子数量 = （前一天桃子数量 + 1） * 2
     * @author Mr.luo
     * @date: 2021/12/5 1:55 下午
     */
    public static int monkeyEatingPeach(int day){
        if (day == 10) {
            return 1;
        } else if(day > 0 && day <= 9) {
            return (monkeyEatingPeach(day + 1) +1) * 2;
        } else {
            System.out.println("day 输入错误");
        }
        return -1;
    }

}
