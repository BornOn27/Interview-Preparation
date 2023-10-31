package main._05_array._2_medium;

public class _04_MaximumSubarray {
    //Question-Link :: https://leetcode.com/problems/maximum-subarray/

    public static void main(String[] args) {
        System.out.println(new _04_MaximumSubarray().maxSubArray(new int[]{-2, -1}));
    }

    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;

            maxSum = Math.max(maxSum, Math.max(currentSum, num));

            if (currentSum < 0)
                currentSum = 0;
        }

        return maxSum;
    }
}
