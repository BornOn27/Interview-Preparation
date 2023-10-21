package main._04_sorting;

import main._00_helper.Util;

public class _04_MergeSort {
    //Question-Link :: https://www.codingninjas.com/studio/problems/merge-sort_5846

    public static void main(String[] args) {
        int[] arrToBeSorted = new int[]{9,8,7,6,5,4,3,1};
        mergeSort(arrToBeSorted, 0, arrToBeSorted.length-1);
        Util.printArr(arrToBeSorted);
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l < r){
            int m = l + (r - l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[m+i+1];
        }

        int i = 0, j = 0;

        while (i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[l++] = left[i++];
            }
            else {
                arr[l++] = right[j++];
            }
        }

        while (i < n1){
            arr[l++] = left[i++];
        }

        while (j < n2){
            arr[l++] = right[j++];
        }
    }
}
