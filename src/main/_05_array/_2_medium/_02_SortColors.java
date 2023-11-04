package main._05_array._2_medium;

import main._00_helper.Util;

public class _02_SortColors {
    //Question-Link ::

    public static void main(String[] args) {
        int[] arr = {2,0,1};
        new _02_SortColors().sortColors(arr);
        Util.printArr(arr);
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high= n-1;
        //0 -- low-1 :: 0
        //low -- mid-1 :: 1
        //mid -- high :: To be sorted
        //high -- n :: 2
        while (mid <= high){
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] ==1){
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
