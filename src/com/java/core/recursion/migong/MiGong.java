package com.java.core.recursion.migong;

/**
 * @author Mr.luo
 * @version 1.0
 * @description: 递归思想解决迷宫问题
 * @date 2021/12/5 4:55 下午
 */
public class MiGong {

    public static void main(String[] args) {
        //思路 
        // 1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7]; 
        // 2. 先规定 map 数组的元素值: 0 表示可以走 1 表示障碍物

        int[][] map = new int[8][7];

        // 先将最上一列 和 最下一列设置成障碍物
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        // 将最左一列 和 最 右一列设置成 1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        // 将第三行 第二和第三列 设置成 1
        map[3][1] = 1;
        map[3][2] = 1;

//        map[2][2] = 1;

        //输出当前的地图
        System.out.println("=====当前地图情况======");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            //输出一行
            System.out.println();
        }

        //使用 findWay 给老鼠找路
        // 下右上左
//        findWay(map, 1, 1);

        //上->右->下->左
        findWay2(map, 1, 1);
        System.out.println("\n====找路的情况如下=====");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
                //输出一行
            }
            System.out.println();
        }

    }

    //使用递归回溯的思想来解决老鼠出迷宫
    // 老韩解读
    // 1. findWay 方法就是专门来找出迷宫的路径
    // 2. 如果找到，就返回 true ,否则返回 false
    // 3. map 就是二维数组，即表示迷宫
    // 4. i,j 就是老鼠的位置，初始化的位置为(1,1)
    // 5. 因为我们是递归的找路，所以我先规定 map 数组的各个值的含义
    // 0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
    // 6. 当 map[6][5] =2 就说明找到通路,就可以结束，否则就继续找.
    // 7. 先确定老鼠找路策略 下->右->上->左
    public static boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            //说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {
                //当前这个位置 0,说明表示可以走
                // 我们假定可以走通
                map[i][j] = 2;
                // 使用找路策略，来确定该位置是否真的可以走通
                // 下->右->上->左
                if (findWay(map, i + 1, j)) {
                    // 先走下
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }

    }

    //修改找路策略，看看路径是否有变化
    // 下->右->上->左 ==> 上->右->下->左
    public static boolean findWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            //说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {
                //当前这个位置 0,说明表示可以走
                // 我们假定可以走通
                map[i][j] = 2;
                // 使用找路策略，来确定该位置是否真的可以走通
                // 下->右->上->左
                if (findWay2(map, i - 1, j)) {
                    // 先走下
                    return true;
                } else if (findWay2(map, i, j + 1)) {
                    return true;
                } else if (findWay2(map, i + 1, j)) {
                    return true;
                } else if (findWay2(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

}
