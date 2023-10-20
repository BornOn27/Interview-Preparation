package main._02_basic_maths;

public class _01_CountDigits {
    //Question-Link :: https://www.codingninjas.com/studio/problems/count-digits_8416387

    public static void main(String[] args) {
        System.out.println(countDigits(306));
    }

    public static int countDigits(int n){
        int result = 0;
        int number = n;
        while (n > 0){
            int currentDigit = n % 10;
            if(currentDigit != 0 && number % currentDigit == 0)
                result++;
            n = n / 10;
        }

        return result;
    }
}
