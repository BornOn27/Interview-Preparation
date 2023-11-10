package main._05_array._3_hard;

import main._00_helper.Util;

public class _10_NumberOfInversions {
    //Question-Link ::https://www.codingninjas.com/studio/problems/number-of-inversions_6840276

    public static void main(String[] args) {
        System.out.println(numberOfInversions(new int[]{5,3,2,1,4}, 5));
    }

    static int result = 0;
    public static int numberOfInversions(int []arr, int n) {
        // Write your code here.
        result = 0;
        mergeSort(arr, 0, n-1);
        return result;
    }

    static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lhs = new int[n1];
        int[] rhs = new int[n2];

        for (int i = 0; i < n1; i++) {
            lhs[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            rhs[i] = arr[m+1+i];
        }

        int i = 0, j = 0;
        while (i < n1 && j < n2){
            if(lhs[i] <= rhs[j]){
                arr[l++] = lhs[i++];
            } else {
                arr[l++] = rhs[j++];
                result += (n1-i);
            }
        }

        while (i < n1)
            arr[l++] = lhs[i++];

        while (j < n2)
            arr[l++] = rhs[j++];
    }
}
