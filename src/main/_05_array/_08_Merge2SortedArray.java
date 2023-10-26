package main._05_array;

import java.util.ArrayList;
import java.util.List;

public class _08_Merge2SortedArray {
    //Question-Link :: https://www.codingninjas.com/studio/problems/sorted-array_6613259

    public static void main(String[] args) {
        System.out.println(sortedArray(new int[]{1, 2, 3, 4, 6}, new int[]{2, 3, 5}));
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if(!result.isEmpty() && a[i] == result.get(result.size()-1)){
                i++;
                continue;
            }

            if(!result.isEmpty() && b[j] == result.get(result.size()-1)){
                j++;
                continue;
            }
            if(a[i] < b[j])
                result.add(a[i++]);
            else result.add(b[j++]);
        }

        while (i < a.length){
            if(!result.isEmpty() && a[i] == result.get(result.size()-1)){
                i++;
                continue;
            }
            result.add(a[i++]);
        }

        while (j < b.length){
            if(!result.isEmpty() && b[j] == result.get(result.size()-1)){
                j++;
                continue;
            }
            result.add(b[j++]);
        }

        return result;
    }
}
