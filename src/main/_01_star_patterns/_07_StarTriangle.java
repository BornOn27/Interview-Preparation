package main._01_star_patterns;

public class _07_StarTriangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/star-triangle_6573671

    /*
        Pattern Type  ==>     *
                             ***
                            *****
     */

    public static void main(String[] args) {
        nStarTriangle(5);
    }

    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //Write code for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //Write code for star
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            //Write code for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
