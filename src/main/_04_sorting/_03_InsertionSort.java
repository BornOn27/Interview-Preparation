package main._04_sorting;

import main._00_helper.Util;

public class _03_InsertionSort {
    //Question-Link :: https://www.codingninjas.com/studio/problems/insertion-sort_624381

    public static void main(String[] args) {
        int[] arrToBeSorted = new int[]{9,8,7,6,5,4,3,1};
        insertionSort(arrToBeSorted, arrToBeSorted.length);
        Util.printArr(arrToBeSorted);
    }

    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for (int i = 1; i < size; i++) {
            int j = i-1;
            while (j>=0 && arr[j] > arr[j+1]){
                swap(arr, j, j+1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
