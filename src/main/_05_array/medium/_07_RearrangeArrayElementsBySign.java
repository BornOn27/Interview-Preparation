package main._05_array.medium;

import main._00_helper.Util;

public class _07_RearrangeArrayElementsBySign {
    //Question-Link :: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

    public static void main(String[] args) {
        Util.printArr(new _07_RearrangeArrayElementsBySign().rearrangeArray(new int[]{3,1,-2,-5,2,-4}));
    }

    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0, odd = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                result[odd] = nums[i];
                odd +=2;
            } else {
                result[even] = nums[i];
                even +=2;
            }
        }

        return result;
    }
}
