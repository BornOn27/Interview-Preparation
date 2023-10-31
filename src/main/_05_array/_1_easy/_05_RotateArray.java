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
        int index = k % nums.length;
        rotateArr(nums, k, index, nums[0]);
    }

    private void rotateArr(int[] arr, int k, int index, int prevNum){
        if(index == 0){
            return;
        }

        int currentNum = arr[index];
        arr[index] = prevNum;
        int nextIndex = (index + k) % arr.length;

        rotateArr(arr, k, nextIndex, currentNum);
    }
}
