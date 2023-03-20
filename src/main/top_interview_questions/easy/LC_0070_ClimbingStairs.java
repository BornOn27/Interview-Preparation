package main.top_interview_questions.easy;

public class LC_0070_ClimbingStairs {

    /**
     * Question : https://leetcode.com/problems/climbing-stairs/
     * Notes :
     *      - If current output is dependent on last 2,
     *      then it is "Fibonacci Series"
     *
     */

    public static void main(String[] args) {
        int stairs = 4;
        System.out.println(new LC_0070_ClimbingStairs().climbStairs(stairs));
    }

    public int climbStairs(int n) {
        if(n <= 2)
            return n;

        int p2 = 1, p1 = 2;
        int i = 3;
        int sum = 0;
        while(i++ <= n){
            sum = p1 + p2;
            p2 = p1;
            p1 = sum;
        }

        return sum;
    }
}
