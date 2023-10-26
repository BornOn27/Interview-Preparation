package main._05_array;

public class _07_LinearSearch {
    //Question-Link :: https://www.codingninjas.com/studio/problems/linear-search_6922070

    public static void main(String[] args) {
        linearSearch(4, 2, new int[]{2, 5, 6, 2});
    }

    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return i;
        }

        return -1;
    }
}
