package archieved.topInterviewQuestions.easy;

public class LC_0136_SingleNumber {

    //Question Link - https://leetcode.com/problems/single-number/
    public static void main(String[] args) {
        int[] num = {4,1,2,1,2};
        System.out.println(new LC_0136_SingleNumber().singleNumber(num));
    }

    public int singleNumber(int[] nums) {
        //Find non-pair number
        if(nums.length == 1)
            return nums[0];
        int xor = nums[0];
        for(int i=1;i<nums.length;i++)
            xor ^= nums[i];

        return xor;
    }
}
