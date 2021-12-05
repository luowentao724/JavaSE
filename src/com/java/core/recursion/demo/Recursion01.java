package com.java.core.recursion.demo;

/**
 * @author Mr.luo
 * @version 1.0
 * @description: 递归调用演示小程序
 * @date 2021/12/5 10:57 上午
 */
public class Recursion01 {

    static class T {
        //打印
        public void test(int n) {
            if (n > 2) {
                test(n - 1);
            }
            System.out.println("n=" + n);
        }

        //factorial 阶乘
        public int factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return factorial(n - 1) * n;
            }
        }
    }

    public static void main(String[] args) {

        // 打印问题
        T t1 = new T();
        t1.test(4);//输出什么？ n=2 n=3 n=4

        // 阶乘问题
        int res = t1.factorial(5);
        System.out.println("5 的阶乘 res =" + res);
    }

}
