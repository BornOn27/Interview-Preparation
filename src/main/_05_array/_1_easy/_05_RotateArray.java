package main._05_array._1_easy;

import main._00_helper.Util;

public class _05_RotateArray {
    //Question-Link :: https://leetcode.com/problems/rotate-array/

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99};
        new _05_RotateArray().rotate(nums, 2);
        Util.printArr(nums);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] arr, int start, int end){
//        Util.printArrWindow(arr, start, end);
//        int ss = start;
//        int ee = end;
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
//        Util.printArrWindow(arr, ss, ee);
    }


    public void rotate_TLE(int[] nums, int k) {
        int index = k % nums.length;
        rotateArr_TLE(nums, k, index, nums[0]);
    }

    private void rotateArr_TLE(int[] arr, int k, int index, int prevNum){
        if(index == 0){
            return;
        }

        int currentNum = arr[index];
        arr[index] = prevNum;
        int nextIndex = (index + k) % arr.length;

        rotateArr_TLE(arr, k, nextIndex, currentNum);
    }
}
