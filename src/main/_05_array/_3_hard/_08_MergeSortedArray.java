package main._05_array._3_hard;

import main._00_helper.Util;

public class _08_MergeSortedArray {
    //Question-Link :: https://leetcode.com/problems/merge-sorted-array/

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,0,0};
        new _08_MergeSortedArray().merge(arr, 3, new int[]{2,5,6}, 3);
        Util.printArr(arr);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] left = new int[m];
        int[] right = new int[n];


        for (int i = 0; i < m; i++) {
            left[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            right[i] = nums2[i];
        }

        int l = 0;
        int i=0, j= 0;
        while (i< m && j < n){
            if(left[i] < right[j])
                nums1[l++] = left[i++];
            else nums1[l++] = right[j++];
        }

        while (i < m)
            nums1[l++] = left[i++];

        while (j < n)
            nums1[l++] = right[j++];
    }


}
