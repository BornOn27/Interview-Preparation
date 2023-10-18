package main._01_star_patterns;

public class _12_NumberCrown {
    //Question-Link :: https://www.codingninjas.com/studio/problems/number-crown_6581894

    /*
        Pattern Type  ==>       1             1
                                1 2         2 1
                                1 2 3     3 2 1
                                1 2 3 4 4 3 2 1
     */

    public static void main(String[] args) {
        numberCrown(4);
    }

    public static void numberCrown(int n) {
        // Write your code here.
        for (int i = 1; i <= n; i++) {
            //Loop for Number
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            //Loop for Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("    ");
            }

            //Loop for Number
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
