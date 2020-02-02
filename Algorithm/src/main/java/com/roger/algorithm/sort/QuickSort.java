package com.roger.algorithm.sort;

import java.util.Arrays;

/**
 * https://time.geekbang.org/column/article/41913
 * 快排核心思想：分治，分区。原地、不稳定算法。所以效率高。
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 10, 8, 6, 1, 4};
        quickSortTraversal(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 快速排序递归函数，p,r为下标
     *
     * @param arr
     * @param p
     * @param r
     * @return
     */
    public static void quickSortTraversal(int[] arr, int p, int r) {

        if (p >= r) return;

        int q = partition(arr, p, r);
        quickSortTraversal(arr, p, q - 1);
        quickSortTraversal(arr, q + 1, r);

    }

    /**
     * 获取分区点
     *
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition(int[] arr, int p, int r) {

        System.out.println("partition " + p + "-->" + r + "   array: " + Arrays.toString(arr));

        int pivot = arr[r];
        int i = p;
        int tmp;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }


        arr[r] = arr[i];
        arr[i] = pivot;

        System.out.println("partition  " + Arrays.toString(arr) + "   I:  " + i + "     pivot  " + pivot);
        return i;
    }

}
