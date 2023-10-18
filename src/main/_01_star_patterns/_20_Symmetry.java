package main._01_star_patterns;

public class _20_Symmetry {
    //Question-Link :: https://www.codingninjas.com/studio/problems/symmetry_6581914

    /*
        Pattern Type  ==>       *         *
                                * *     * *
                                * * * * * *
                                * *     * *
                                *         *
     */

    public static void main(String[] args) {
        symmetry(3);
    }

    public static void symmetry(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < (n - i); j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < (n - i); j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
