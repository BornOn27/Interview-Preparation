package main._01_star_patterns;

public class _21_Ninja_And_The_Star_Pattern_I {

    //Question-Link :: https://www.codingninjas.com/studio/problems/ninja-and-the-star-pattern-i_6581920

    /*
        Pattern Type  ==>       *****
                                *   *
                                *   *
                                *   *
                                *****
     */

    public static void main(String[] args) {
        getStarPattern(1);
    }

    public static void getStarPattern(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        if(n == 1)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
