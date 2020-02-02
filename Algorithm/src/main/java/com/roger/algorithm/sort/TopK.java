package com.roger.algorithm.sort;

public class TopK {

    /**
     * 第K大也是第N-K小的
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 10, 8, 6, 1, 4};
        // warning 'arr.length - 1
        System.out.println(topK(arr, 0, arr.length-1, arr.length-1));
    }


    private static int topK(int[] arr, int p, int r, int kSmallest) {

        if (p == r) return arr[p];

        int q = partition(arr, p, r);

        if (kSmallest == q) {
            return arr[q];
            // warning! '<'
        } else if (kSmallest < q) {
            // left
           return topK(arr, p, q - 1, kSmallest);
        }

        // right
        return topK(arr, q + 1, r, kSmallest);

    }


    private static int partition(int[] arr, int p, int r) {

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

        return i;
    }


}
