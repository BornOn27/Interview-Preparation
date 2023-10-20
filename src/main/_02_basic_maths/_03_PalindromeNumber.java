package main._02_basic_maths;

public class _03_PalindromeNumber {
    //Question-Link :: https://leetcode.com/problems/palindrome-number/description/

    public static void main(String[] args) {
        System.out.println(new _03_PalindromeNumber().isPalindrome(12321));
    }

    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int reversedNumber = 0;
        int initialNumber = x;

        while (x > 0){
            int currentDigit = x % 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
            x = x / 10;
        }

        return reversedNumber == initialNumber;
    }
}
