package main._05_array._2_medium;

public class _03_MajorityElement {
    //Question-Link :: https://leetcode.com/problems/majority-element/

    public static void main(String[] args) {
        System.out.println(new _03_MajorityElement().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public int majorityElement(int[] nums) {
        int votes = 1;
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (votes == 0){
                votes++;
                result = nums[i];
            }
            else if(nums[i] == result)
                votes++;
            else {
                votes--;
            }
        }

        return result;
    }
}
