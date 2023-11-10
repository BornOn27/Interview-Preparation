package main._05_array._3_hard;

import main._00_helper.Util;

public class _11_ReversePairs {
    //Question-Link :: https://leetcode.com/problems/reverse-pairs/description/

    public static void main(String[] args) {

        System.out.println(new _11_ReversePairs().reversePairs(new int[]{40,25,19,12,9,6,2}));

    }

    int result = 0;
    public int reversePairs(int[] nums) {
        result = 0;
        mergeSort(nums, 0, nums.length-1);
        return result;
    }

    public void countPairs(int[] arr, int l, int m, int h) {
        int j = m + 1;
        for (int i = l; i <= m; i++) {
            while (j <= h){
                if(arr[i] > (long) 2 * arr[j]) {
                    result += (m - i + 1);
                    j++;
                } else break;
            }
        }
    }

    private void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            countPairs(arr, l, m, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lhs = new int[n1];
        int[] rhs = new int[n2];

        for (int i = 0; i < n1; i++) {
            lhs[i] = arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            rhs[i] = arr[m+1+i];
        }

        int i=0, j=0;
        while (i < n1 && j < n2){
            if(lhs[i] <= rhs[j]){
                arr[l++] = lhs[i++];
            } else {
                arr[l++] = rhs[j++];
            }
        }

        while (i < n1)
            arr[l++] = lhs[i++];

        while (j < n2)
            arr[l++] = rhs[j++];
    }
}
