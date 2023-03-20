package main.top_interview_questions.easy;

public class LC_0069_SqrtOfx {

    /**
     * Question : https://leetcode.com/problems/sqrtx/
     * Notes :
     *       - When dealing with addition, multiplication of numbers
     *          always check the range, it will overflow
     *       - Use Long in case it is in range of Integers
     *
     */


    public static void main(String[] args) {
        System.out.println(new LC_0069_SqrtOfx().mySqrt(10));
    }

    //Sequential Search
    public int mySqrt_v1(int x) {
        if(x < 4)
            return x == 0? 0 : 1;
        long i = 1;
        for (; i <= x/2; i++) {

            if(i*i == x)
                return (int) i;
            if(i*i > x)
                return (int) (i-1);
        }

        return (int) (i-1);
    }

    //Binary Search, corner-cases handled separately
    public int mySqrt(int x) {
        if(x < 4)
            return x == 0? 0 : 1;
        if(x < 9)
            return 2;
        long l = 1, r = x/2;

        while (l < r){
            long m = l + (r - l)/2;
            if(m * m == x || l == m)
                return (int) m;

            long sq = m * m;
            if(sq > x)
                r = m;
            else l = m;
        }

        return (int) l+1;
    }
}
