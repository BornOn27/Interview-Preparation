package main._04_sorting;

import main._00_helper.Util;

public class _01_SelectionSort {
    //Question-Link ::  https://www.codingninjas.com/studio/problems/selection-sort_624469

    public static void main(String[] args) {
        int[] arrToBeSorted = new int[]{9,8,7,6,5,4,3,1};
        selectionSort(arrToBeSorted);
        Util.printArr(arrToBeSorted);
    }

    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
