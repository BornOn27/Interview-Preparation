package main._01_star_patterns;

public class _19_SymmetricVoid {
    //Question-Link :: https://www.codingninjas.com/studio/problems/symmetric-void_6581919

    /*
        Pattern Type  ==>       * * * * * *
                                * *     * *
                                *         *
                                *         *
                                * *     * *
                                * * * * * *
     */

    public static void main(String[] args) {
        symmetry(3);
    }

    public static void symmetry(int n) {
        // Write your code here
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
