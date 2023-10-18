package main._01_star_patterns;

public class _08_ReverseStarTriangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/reverse-star-triangle_6573685

    /*
        Pattern Type  ==>       *****
                                 ***
                                  *
     */

    public static void main(String[] args) {
        nStarTriangle(3);
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = n; i > 0; i--) {
            //Loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //Loop for star
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }

            //Loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
