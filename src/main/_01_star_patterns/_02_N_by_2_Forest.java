package main._01_star_patterns;

public class _02_N_by_2_Forest {
    //Question-Link :: https://www.codingninjas.com/studio/problems/n-2-forest_6570178

    /*
        Pattern Type  ==>   *
                            * *
                            * * *


     */

    public static void main(String[] args) {
        nForest(3);
    }

    public static void nForest(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
