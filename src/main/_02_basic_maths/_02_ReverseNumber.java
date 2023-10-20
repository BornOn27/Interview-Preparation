package main._02_basic_maths;

public class _02_ReverseNumber {
    //Question-Link :: https://leetcode.com/problems/reverse-integer/

    public static void main(String[] args) {
        System.out.println(new _02_ReverseNumber().reverse(1534236469));
    }

    public int reverse(int x) {
        if(x == 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE)
            return 0;

        int initialNumber = x;
        boolean isNumberNegative = false;
        if(x < 0){
            x = x * -1;
            isNumberNegative = true;
        }

        int result = 0;
        while (x > 0){
            int currentDigit = x % 10;
            //Add previous number check
            int prev = result;
            result = (result * 10) + currentDigit;
            if((result/10) != prev)
                return 0;
            x = x / 10;
        }

        if(isNumberNegative)
            result = result * -1;

        //Handle corner case
        if ((initialNumber > -1 && result < 0) || (initialNumber < 0 && result > -1)){
            return 0;
        }

        return result;
    }
}
