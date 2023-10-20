package main._03_basic_hashing;

import main._00_helper.Util;

import java.util.Arrays;
import java.util.HashMap;

public class _02_HighestLowestFrequencyElements {
    //Question-Link :: https://www.codingninjas.com/studio/problems/k-most-occurrent-numbers_625382

    public static void main(String[] args) {
        Util.printArr(getFrequencies(new int[]{10, 10, 9,9, 2, 1, 2, 1}));
    }

    public static int[] getFrequencies(int []nums) {
        // Write Your Code Here
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxF = -1;
        int minF = Integer.MAX_VALUE;

        int[] result = new int[2];
        Arrays.fill(result, Integer.MAX_VALUE);


        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        for (int key : count.keySet()) {
            maxF = Math.max(maxF, count.get(key));
            minF = Math.min(minF, count.get(key));
        }

//        System.out.println(count);
//        System.out.println(minF+" "+maxF);

        for(int key : count.keySet()){
            if(count.get(key) == maxF){
                result[0] = Math.min(result[0], key);
            }

            if(count.get(key) == minF){
                result[1] = Math.min(result[1], key);
            }
        }

        return result;
    }
}
