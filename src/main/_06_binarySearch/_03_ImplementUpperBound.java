package main._06_binarySearch;

public class _03_ImplementUpperBound {
    //Question-Link :: https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383

    public static void main(String[] args) {
        System.out.println(upperBound(new int[]{1, 5, 5, 7, 7, 9, 10}, 5, 7));
    }

    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int ans = n;
        int low = 0, high = n-1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
