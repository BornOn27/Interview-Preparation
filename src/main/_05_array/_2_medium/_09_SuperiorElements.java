package main._05_array._2_medium;

import java.util.*;

public class _09_SuperiorElements {
    //Question-Link :: https://www.codingninjas.com/studio/problems/superior-elements_6783446

    public static void main(String[] args) {
        System.out.println(superiorElements(new int[]{5,4,3}));
    }

    public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
        int[] maxInRight = new int[arr.length];
        Set<Integer> set = new TreeSet<>();
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            maxInRight[i] = max;
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxInRight[i])
                set.add(arr[i]);
        }

        return new ArrayList<>(set);
    }
}
