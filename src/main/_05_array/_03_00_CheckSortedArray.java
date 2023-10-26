package main._05_array;

public class _03_00_CheckSortedArray {

    //Question-Link :: https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957
    public static void main(String[] args) {
        System.out.println(isSorted(5, new int[]{4, 5, 4, 4, 4}));
    }

    public static int isSorted(int n, int []a) {
        // Write your code here.
        for (int i = 1; i < n; i++) {
            if(a[i-1] > a[i])
                return 0;
        }

        return 1;
    }
}
