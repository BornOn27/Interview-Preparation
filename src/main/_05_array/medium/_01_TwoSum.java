package main._05_array.medium;

import main._00_helper.Util;

import java.util.HashMap;

public class _01_TwoSum {
    //Question-Link :: https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        Util.printArr(new _01_TwoSum().twoSum(new int[]{3,3}, 6));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}
