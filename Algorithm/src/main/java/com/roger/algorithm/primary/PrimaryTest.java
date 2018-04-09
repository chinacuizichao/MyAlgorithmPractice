package com.roger.algorithm.primary;

/**
 * Created by roger on 2018/4/6.
 */

public class PrimaryTest {

    public static void main(String[] args) {

        //int[] nums = { 1, 1, 2 };
        //System.out.print(removeDuplicates(nums));

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",  ");
        }
    }

    /**
     * 给定数组: nums = [1,1,2],
     * 你的函数应该返回新长度 2, 并且原数组nums的前两个元素必须是1和2
     * 不需要理会新的数组长度后面的元素
     */
    private static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }

    /**
     * 将包含 n 个元素的数组向右旋转 k 步。
     * 例如，如果  n = 7 ,  k = 3，给定数组  [1,2,3,4,5,6,7]  ，向右旋转后的结果为 [5,6,7,1,2,3,4]。
     */
    private static void rotateArray(int[] nums, int k) {
        if (k <= 0) return;                       //考虑k <= 0的情况
        int n = nums.length - (k % nums.length);  //考虑k > nums.length的情况
        reverse(nums, 0, n - 1);
        reverse(nums, n, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    private static void reverse(int[] nums, int l, int r) {
        if (l < 0 || l >= nums.length || r < 0 || r >= nums.length) return;
        int i = l, j = r;
        int tmp;
        while (i < j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }

    /**
     * 假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。
     * 设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。
     * 然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。
     */
    private static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int startPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

}
