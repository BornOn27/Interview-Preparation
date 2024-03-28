package main._05_array._2_medium;

import main._00_helper.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _08_NextPermutation {
    //Question-Link :: https://leetcode.com/problems/next-permutation/description/

    /*
        1. Find Dipping Point
        2. Swap it with next greater number
        3. Reverse all after dipping point
     */
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        new _08_NextPermutation().nextPermutation(arr);
        Util.printArr(arr);
    }

    public void nextPermutation(int[] nums) {
        int targetIndex = -1;
        for (int i = nums.length-2; i > -1; i--) {
            if(nums[i] < nums[i+1]){
                targetIndex = i;
                break;
            }
        }

        if(targetIndex == -1){
            reverseArray(nums, 0, nums.length-1);
        } else {
            int nextGreater = findNextGreater(nums, targetIndex);
            int temp = nums[nextGreater];
            nums[nextGreater] = nums[targetIndex];
            nums[targetIndex] = temp;
            reverseArray(nums, targetIndex+1, nums.length-1);
        }
    }

    private int findNextGreater(int[] nums, int targetIndex) {

        for (int i = nums.length-1; i > targetIndex; i--) {
            if(nums[i] > nums[targetIndex])
                return i;
        }

        return -1;
    }

    private void reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;end--;
        }
    }
}
