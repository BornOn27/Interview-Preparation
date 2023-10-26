package main._05_array;

public class _01_LargestElementInTheArray {
    //Question-Link :: https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279

    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{4,7, 8, 6, 7, 6 }, 6));
    }

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int result = Integer.MIN_VALUE;
        for (int num : arr) {
            result = Math.max(result, num);
        }
        return result;
    }
}
