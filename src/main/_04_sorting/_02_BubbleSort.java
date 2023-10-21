package main._04_sorting;

import main._00_helper.Util;

public class _02_BubbleSort {
    //Question-Link :: https://www.codingninjas.com/studio/problems/bubble-sort_624380

    public static void main(String[] args) {
        int[] arrToBeSorted = new int[]{9,8,7,6,5,4,3,1};
        bubbleSort(arrToBeSorted, arrToBeSorted.length);
        Util.printArr(arrToBeSorted);
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
