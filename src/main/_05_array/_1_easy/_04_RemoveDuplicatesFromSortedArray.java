package main._05_array._1_easy;

import main._00_helper.Util;

public class _04_RemoveDuplicatesFromSortedArray {
    //Question-Link :: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        Util.printArrTillN(nums, new _04_RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int uniqueNums = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]){
                uniqueNums++;
                nums[uniqueNums] = nums[i];
            }
        }

        return uniqueNums+1;
    }
}
