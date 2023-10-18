package main._01_star_patterns;

public class _22_NinjaAndTheNumberPattern {
    //Question-Link :: https://www.codingninjas.com/studio/problems/ninja-and-the-number-pattern-i_6581959

    /*
        Pattern Type  ==>       555555555
                                544444445
                                543333345
                                543222325
                                543212345
                                543222325
                                543333345
                                544444445
                                555555555
     */

    public static void main(String[] args) {
        getNumberPattern(4);
    }

    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(n-j);
            }

            for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                System.out.print(i);
            }

            int secondStart = i;

            if(i == 1){
                secondStart = 2;
            }
            for (int j = secondStart; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(n-j);
            }

            for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                System.out.print(i);
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
