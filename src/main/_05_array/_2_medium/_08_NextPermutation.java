package main._05_array._2_medium;

import main._00_helper.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _08_NextPermutation {
    //Question-Link :: https://leetcode.com/problems/next-permutation/description/

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        new _08_NextPermutation().nextPermutation(arr);
        Util.printArr(arr);
    }

    List<int[]> result = new ArrayList<>();
    public void nextPermutation(int[] nums) {
        int[] thisArr = nums.clone();
        Arrays.sort(thisArr);
        printPermutations(thisArr, 0);

        for (int i = 0; i < result.size(); i++) {

            if(Arrays.equals(result.get(i), nums)){
                int[] ans = result.get((i+1) % result.size());

                for (int j = 0; j < ans.length; j++) {
                    nums[j] = ans[j];
                }
                break;
            }
        }

    }

    private void printPermutations(int[] arr, int index){
        if(index >= arr.length){
            result.add(arr.clone());
//            Util.printArr(arr);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            printPermutations(arr, index+1);
            swap(arr, index, i);
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
