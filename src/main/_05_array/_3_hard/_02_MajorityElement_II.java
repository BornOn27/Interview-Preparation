package main._05_array._3_hard;

import java.util.ArrayList;
import java.util.List;

public class _02_MajorityElement_II {
    //Question-Link :: https://leetcode.com/problems/majority-element-ii/description/

    public static void main(String[] args) {
        System.out.println(new _02_MajorityElement_II().majorityElement(new int[]{1,2}));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count1 = 0, count2 = 0, answer1 = Integer.MIN_VALUE, answer2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(count1 == 0 && nums[i] != answer2){
                count1 = 1;
                answer1 = nums[i];
            } else if(count2 == 0 && nums[i] != answer1){
                count2 = 1;
                answer2 = nums[i];
            } else if(nums[i] == answer1){
                count1++;
            } else if(nums[i] == answer2) {
                count2++;
            } else {
                count1--; count2--;
            }
        }

        count1 = 0; count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == answer1) count1++;
            if (nums[i] == answer2) count2++;
        }

        if(count1 > (nums.length)/3)
            result.add(answer1);
        if(count2 > (nums.length)/3)
            result.add(answer2);

        return result;
    }
}
