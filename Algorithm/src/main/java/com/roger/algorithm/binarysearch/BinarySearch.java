package com.roger.algorithm.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

    }


    public static int binarySearch(int[] array, int size, int target) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target){
                high = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;

    }


    public static int bSearch(int[] array, int size, int target) {
        int low = 0;
        int high = size - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else if (array[high] < target) {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int bSearchRecrusion(int low, int high, int[] array, int target) {

        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        } else if (array[mid] < target) {
            bSearchRecrusion(mid + 1, high, array, target);
        } else if (array[mid] > target) {
            bSearchRecrusion(low, high - 1, array, target);
        } else if (array[mid] == target) {
            return mid;
        }

        return -1;
    }

}
