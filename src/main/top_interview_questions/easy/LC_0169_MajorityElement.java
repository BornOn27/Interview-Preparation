package main.top_interview_questions.easy;

public class LC_0169_MajorityElement {

    //Question Link - https://leetcode.com/problems/majority-element/
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(new LC_0169_MajorityElement().majorityElement(nums));
    }

    /**
     * Moore's Counting Algorithm
     *  If there is guaranteed Majority Element - n, whose count(n) > arr.length/2
     *  Then Algorithm to find it -
     *      1. Assume current number is Majority Element
     *      2. Increment count, if same number found.
     *      3. Decrement count, if (any) different number found
     *          - If count is zero, update the Majority Element as current number
     */
    public int majorityElement(int[] nums) {
        int count = 1;
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] == max)
                count++;
            else count--;

            if(count == 0){
                max = nums[i];
                count++;
            }
        }

        return max;
    }
}
