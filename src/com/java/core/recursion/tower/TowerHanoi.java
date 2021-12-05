package com.java.core.recursion.tower;

/**
 * @author Mr.luo
 * @version 1.0
 * @description: 递归调用应用实例-汉诺塔
 * 汉诺塔传说 汉诺塔：汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。
 * 大梵天创造世界的时候做了三根金刚石柱子， 在一根柱子上从下往上按照大小顺序摞着 64 片圆盘。
 * 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一 根柱子上。
 * 并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
 * @date 2021/12/5 6:35 下午
 */
public class TowerHanoi {

    public static void main(String[] args) {
        move(64, 'A', 'B', 'C');
    }

    //方法
    // num 表示要移动的个数, a, b, c 分别表示 A 塔，B 塔, C 塔
    public static void move(int num, char a, char b, char c) {
        //如果只有一个盘 num = 1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，可以看成两个 , 最下面的和上面的所有盘(num-1)
            // (1)先移动上面所有的盘到 b, 借助 c
            move(num - 1, a, c, b);
            //(2)把最下面的这个盘，移动到 c
            System.out.println(a + "->" + c);
            //(3)再把 b 塔的所有盘，移动到 c ,借助 a
            move(num - 1, b, a, c);
        }
    }

}
