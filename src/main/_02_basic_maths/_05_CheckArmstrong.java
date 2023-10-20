package main._02_basic_maths;

public class _05_CheckArmstrong {
    //Question-Link :: https://www.codingninjas.com/studio/problems/check-armstrong_589

    public static void main(String[] args) {
        System.out.println(checkArmstrong(371));
    }

    public static boolean checkArmstrong(int n){
        int digitLength = ("" + n).length();
        int initialNumber = n;
        int result = 0;
        while (n > 0) {
            int thisDigit = n % 10;
            result += Math.pow(thisDigit, digitLength);
            n = n / 10;
        }

        return result == initialNumber;
    }
}
