package main._05_array._1_easy;

public class _10_MaxConsecutiveOnes {
    //Question-Link :: https://leetcode.com/problems/max-consecutive-ones/description/

    public static void main(String[] args) {
        System.out.println(new _10_MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int currentMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                currentMax++;
                result = Math.max(result, currentMax);
            } else currentMax = 0;
        }

        return result;
    }
}
