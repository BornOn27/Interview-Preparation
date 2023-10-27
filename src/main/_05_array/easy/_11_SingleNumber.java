package main._05_array.easy;

public class _11_SingleNumber {
    //Question-Link :: https://leetcode.com/problems/single-number/

    public static void main(String[] args) {
        System.out.println(new _11_SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}
