package com.roger.algorithm.sort;

public class MergeSort {


    public static void main(String[] args) {

    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int pivot = (start + end) / 2;

        mergeSort(arr, start, pivot);
        mergeSort(arr, pivot + 1, end);
    }

    public static void merge() {

    }

}
