package main._05_array._3_hard;

import java.util.HashMap;
import java.util.Map;

public class _4_CountTheNumberOfSubarraysWithGivenXorK {
    //Question-Link :: https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258

    public static void main(String[] args) {
        System.out.println(subarraysWithSumK(new int[]{1, 3, 3, 3, 5}, 6));
    }

    public static int subarraysWithSumK(int []arr, int b) {
        long prefixXor = 0;
        Map<Long, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixXor ^= arr[i];

            if(map.containsKey(prefixXor)){
                result = Math.max(result, i - map.get(prefixXor));
            } else map.put(prefixXor, i);
        }

        return result;
    }
}
