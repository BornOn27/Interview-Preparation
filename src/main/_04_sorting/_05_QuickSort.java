package main._04_sorting;

import main._00_helper.Util;

public class _05_QuickSort {
    //Question-Link :: https://www.codingninjas.com/studio/problems/quick-sort_5844

    public static void main(String[] args) {
        int[] arrToBeSorted = new int[]{9,8,7,6,5,4,3,1};
        quickSort(arrToBeSorted, 0, arrToBeSorted.length-1);
        Util.printArr(arrToBeSorted);
    }

    public static void quickSort(int[] input,int l, int r) {
        if(l < r){
            int p = partition(input, l, r);
            quickSort(input, l, p-1);
            quickSort(input, p+1, r);
        }
    }

    private static int partition(int[] arr, int l, int r){
        int i = l-1;
        for (int j = l; j <= r-1; j++) {
            if(arr[j] < arr[r]){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, r);
        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
