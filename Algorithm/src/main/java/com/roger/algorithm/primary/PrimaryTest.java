package com.roger.algorithm.primary;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roger on 2018/4/6.
 */

public class PrimaryTest {

  public static void main(String[] args) {

    //int[] nums = { 1, 1, 2 };
    //System.out.print(removeDuplicates(nums));

    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
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
    int flag = k;
    for (int i = nums.length - 1, j = 0; i > k; i--, j++) {
      int temp = nums[j];
      nums[j] = nums[nums.length - flag];
      nums[i] = temp;
      flag --;
    }
  }
}
