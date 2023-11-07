package main._05_array._2_medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _14_SubarraySumEqualsK {
    //Question-Link ::

    public static void main(String[] args) {
        System.out.println(new _14_SubarraySumEqualsK().subarraySum(new int[]{1,2,3}, 3));
    }

    public int subarraySum(int[] nums, int k) {
        long prefixSum = 0;
        HashMap<Long, Integer> foundSums = new HashMap<>();
        foundSums.put(0L, 1);

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
//            System.out.println("PrefixSum :: "+prefixSum);
//            System.out.println(foundSums);

            if(foundSums.containsKey(prefixSum - k)){
                result += foundSums.get(prefixSum - k);
            }

            foundSums.put(prefixSum, foundSums.getOrDefault(prefixSum, 0) + 1);
        }


        return result;
    }
}
