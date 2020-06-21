package com.roger.algorithm;

/**
 * 回溯算法
 */
public class Backtracking {

    /**
     * 我们有一个背包，背包总的承载重量是 Wkg。
     * 现在我们有 n 个物品，每个物品的重量不等，并且不可分割。我们现在期望选择几件物品，装载到背包中。
     * 在不超过背包所能装载重量的前提下，如何让背包中物品的总重量最大？
     */
    public static void main(String[] args) {

    }

    // 存储背包中物品总重量的最大值
    private static int MAX_WEIGHT = Integer.MIN_VALUE;

    /**
     *
     * @param i 表示考察到哪个物品了
     * @param cw 表示当前已经装进去的物品的重量和
     * @param items items表示每个物品的重量
     * @param n 表示物品个数
     * @param w 背包重量
     */
    public static void f(int i, int cw, int[] items, int n, int w) {
        // cw==w表示装满了;i==n表示已经考察完所有的物品
        if (cw == w || i == n) {
            if (cw > MAX_WEIGHT) {
                MAX_WEIGHT = cw;
            }

            return;
        }

        f(i + 1, cw, items, n, w);

        // 已经超过可以背包承受的重量的时候，就不要再装了
        if (cw + items[i] <= w) {
            f(i + 1, cw + items[i], items, n, w);
        }
    }

}
