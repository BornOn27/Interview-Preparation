package main._06_binarySearch;

public class _01_BinarySearch {
    //Question-Link :: https://leetcode.com/problems/binary-search/

    public static void main(String[] args) {
        System.out.println(new _01_BinarySearch().search(new int[]{5}, 5));
    }

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] > target)
                end = mid-1;
            else  start = mid + 1;
        }

        return -1;
    }
}
