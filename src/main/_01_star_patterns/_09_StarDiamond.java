package main._01_star_patterns;

public class _09_StarDiamond {
    //Question-Link :: https://www.codingninjas.com/studio/problems/star-diamond_6573686

    /*
        Pattern Type  ==>         *
                                 ***
                                *****
                                *****
                                 ***
                                  *
     */

    public static void main(String[] args) {
        nStarDiamond(5);
    }

    public static void nStarDiamond(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
