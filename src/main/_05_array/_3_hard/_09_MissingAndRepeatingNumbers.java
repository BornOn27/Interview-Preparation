package main._05_array._3_hard;

import main._00_helper.Util;

public class _09_MissingAndRepeatingNumbers {
    //Question-Link :: https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164

    public static void main(String[] args) {
        Util.printArr(findMissingRepeatingNumbers(new int[]{1,4,2,2}));
    }

    public static int[] findMissingRepeatingNumbers(int []arr) {
        // Write your code here
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
//                System.out.println(i);
                //Swap till index is fixed
                while (arr[i] != i + 1){
                    if(arr[arr[i] - 1] == arr[i]){
                        result[0] = arr[i];
                        break;
                    }

                    int v1 = arr[i];
                    int v2 = arr[arr[i]-1];

                    int index1 = i;
                    int index2 = arr[i]-1;

                    arr[index1] = v2;
                    arr[index2] = v1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1)
                result[1] = i+1;
        }

        return result;
    }
}
