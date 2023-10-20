package main._02_basic_maths;

public class _04_HCF {
    //Question-Link :: https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448

    public static void main(String[] args) {
        System.out.println(calcGCD(2, 5));
    }

    public static int calcGCD(int n, int m){
        // Write your code here.
        if(n == 0 || m == 0)
            return 0;
        if(n == 1 || m == 1)
            return 1;
        if(n % m == 0)
            return m;
        if(m % n == 0)
            return n;
        int minNumber = Math.min(n, m);
        int result = -1;
        for (int i = 1; i <= minNumber / 2; i++) {
            if(n % i == 0 && m % i == 0){
                result = i;
            }
        }

        return result;
    }
}
