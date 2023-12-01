package main._06_binarySearch;

public class _02_ImplementLowerBound {
    //Question-Link :: https://www.codingninjas.com/studio/problems/lower-bound_8165382

    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1, 2, 2, 3, 3, 5}, 6,2));
    }

    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int ans = n;
        int low = 0, high = n-1;

        while (low <= high){
            int m = low + (high - low)/2;

            if(arr[m] >= x){
                ans = m;
                high = m - 1;
            } else {
                low = m + 1;
            }
        }


        return ans;
    }
}
