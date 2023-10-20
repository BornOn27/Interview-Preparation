package main._03_basic_hashing;

import main._00_helper.Util;

import java.util.HashMap;

public class _01_CountFrequencyInaRange {
    //Question-Link :: https://www.codingninjas.com/studio/problems/count-frequency-in-a-range_8365446

    public static void main(String[] args) {
        Util.printArr(countFrequency(6, 4, new int[]{1, 3, 4, 3, 4, 1}));
    }

    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if(num > n)
                continue;
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = count.getOrDefault(i+1, 0);
        }

        return result;
    }
}
