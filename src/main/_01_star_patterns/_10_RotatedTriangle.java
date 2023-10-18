package main._01_star_patterns;

public class _10_RotatedTriangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/rotated-triangle_6573688

    /*
        Pattern Type  ==>       *
                                **
                                ***
                                **
                                *
     */

    public static void main(String[] args) {
        nStarTriangle(3);
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
