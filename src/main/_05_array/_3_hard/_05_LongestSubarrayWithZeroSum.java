package main._05_array._3_hard;

import java.util.HashMap;
import java.util.Map;

public class _05_LongestSubarrayWithZeroSum {
    //Question-Link :: https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450

    public static void main(String[] args) {
        System.out.println(getLongestZeroSumSubarrayLength(new int[]{1, 0, -1, 1}));
    }

    public static int getLongestZeroSumSubarrayLength(int []arr){
        int result = 0;
        Long prefixSum = 0L;

        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if(map.containsKey(prefixSum)){
                result = Math.max(result, i - map.get(prefixSum));
//                System.out.println("result :: "+result+" "+i);
            } else {
                map.put(prefixSum, i);
            }

//            System.out.println(map);
        }

        return result;
    }
}
