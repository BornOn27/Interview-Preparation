package main._05_array._3_hard;

import java.util.HashMap;
import java.util.Map;

public class _4_CountTheNumberOfSubarraysWithGivenXorK {
    //Question-Link :: https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258

    public static void main(String[] args) {
        System.out.println(subarraysWithSumK(new int[]{1, 3, 3, 3, 5}, 6));
    }

    public static int subarraysWithSumK(int []arr, int b) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXor = 0;
        map.put(prefixXor, 1);

        for (int i = 0; i < arr.length; i++) {
            prefixXor ^= arr[i];

            if(map.containsKey(prefixXor ^ b)){
                result += map.get(prefixXor ^ b);
            }

            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }

        return result;
    }
}
