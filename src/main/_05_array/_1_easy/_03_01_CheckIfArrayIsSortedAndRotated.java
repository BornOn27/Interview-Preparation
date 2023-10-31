package main._05_array._1_easy;

public class _03_01_CheckIfArrayIsSortedAndRotated {
    //Question-Link :: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

    public static void main(String[] args) {
        System.out.println(new _03_01_CheckIfArrayIsSortedAndRotated().check(new int[]{6,10,6}));
    }

    public boolean check(int[] nums) {
        int issue = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i+1)%nums.length])
                issue++;
        }

        return issue <= 1;
    }
}
