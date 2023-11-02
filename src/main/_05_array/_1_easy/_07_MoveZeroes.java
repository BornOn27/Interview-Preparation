package main._05_array._1_easy;

import main._00_helper.Util;

public class _07_MoveZeroes {
    //Question-Link :: https://leetcode.com/problems/move-zeroes/description/

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        new _07_MoveZeroes().moveZeroes(arr);
        Util.printArr(arr);
    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if(num != 0){
                nums[index++] = num;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
