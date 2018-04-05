package com.roger.algorithm.primary;

/**
 * Created by roger on 2018/4/6.
 */

public class PrimaryTest {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        System.out.print(removeDuplicates(nums));
    }

    /**
     * 给定数组: nums = [1,1,2],
     * 你的函数应该返回新长度 2, 并且原数组nums的前两个元素必须是1和2
     * 不需要理会新的数组长度后面的元素
     */
    private static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i])
                nums[++index] = nums[i];
        }
        return index + 1;
    }

}
