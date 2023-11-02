package main._05_array._1_easy;

import java.util.HashMap;

public class _14_LongestSubarrayWithSumK_PositiveAndNegativeNumbersAlso {
    //Question-Link :: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505

    public static void main(String[] args) {
        System.out.println(getLongestSubarray(new int[]{-50, 0, 52}, 2));
    }

    public static int getLongestSubarray(int []nums, int k) {
        // Write your code here.
        long prefixSum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if(prefixSum == k)
                result = Math.max(result, i+1);

            if(map.containsKey(prefixSum - k)){
                result = Math.max(result, i - map.get(prefixSum - k));
            }

            if(!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }

        return result;
    }
}
