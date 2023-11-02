package main._05_array._1_easy;

public class _13_LongestSubarrayWithSumK_PositiveNumbersOnly {
    //Question-Link :: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399

    public static void main(String[] args) {
        System.out.println(longestSubarrayWithSumK(new int[]{1,2,1,3}, 2));
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        if(a.length == 1){
            if(a[0] == k)
                return 1;
            else return 0;
        }

        int l = 0, r = 1;
        long sum = a[l] + a[r];
        int result = 0;

        if(a[l] == k || a[r] == k)
            result = 1;

        while (r < a.length){
//            System.out.println("l::"+l+" r::"+r+" sum::"+sum+" result::"+result);
            if(sum == k){
                result = Math.max(result, r - l + 1);
                r++;
                if(r < a.length)
                    sum += a[r];
            } else if(sum > k){
                //Check if they are at same index
                if(l == r){
                    l++;r++;
                    if(r < a.length)
                        sum = a[r];
                } else{
                    //Reduce the window
                    sum -= a[l];
                    l++;
                }
            } else {
                r++;
                if(r < a.length)
                    sum += a[r];
            }
        }
        

        return result;
    }
}
