package main._05_array._1_easy;

public class _13_LongestSubarrayWithSumK_PositiveNumbersOnly {
    //Question-Link :: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399

    public static void main(String[] args) {
        System.out.println(longestSubarrayWithSumK(new int[]{1,2,1,3}, 2));
    }

    /*
        When the number is bigger, the sum turns into negative due to start movement,
        But in the next Iteration, when end moves forward it add the same number and it becomes '0'
     */
    public static int longestSubarrayWithSumK(int []arr, long k) {
        int result = 0;
        long sum = 0;
        int start = 0, end = -1, n = arr.length;

        while (start < n){
            while ((end + 1) < n && sum + arr[end + 1] <= k){
//                System.out.println("S :: "+start+" E :: "+end+" Sum :: "+sum);
                sum += arr[++end];
//                System.out.println("S :: "+start+" E :: "+end+" Sum :: "+sum);
//                System.out.println();
            }

            if(sum == k){
                result = Math.max(result, end - start + 1);
            }

//            System.out.println("S :: "+start+" E :: "+end+" Sum :: "+sum);
            sum -= arr[start++];
//            System.out.println("S :: "+start+" E :: "+end+" Sum :: "+sum);
//            System.out.println();
        }

        return result;
    }


    public static int longestSubarrayWithSumK_NotOptimal(int []a, long k) {
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
