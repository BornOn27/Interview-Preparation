package main.playground;

import main._00_helper.Util;

import java.util.*;

public class JavaPlayground {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
//        int arr2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println("Majority Seq :: "+new JavaPlayground().subarraySum(arr, 2));
//        new JavaPlayground().longestConsecutive(arr);
        System.out.println("Count :: "+subarraysWithSumK(arr, 2));

//        Util.printArr(arr);
    }
    public static int subarraysWithSumK(int []a, int b) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXor = 0;
        map.put(prefixXor, 1);

        for (int i = 0; i < a.length; i++) {
            prefixXor ^= a[i];

            if(map.containsKey(prefixXor ^ b)){
                result += map.get(prefixXor ^ b);
            }

            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }

        return result;
    }
}
