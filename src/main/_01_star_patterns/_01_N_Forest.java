package main._01_star_patterns;

public class _01_N_Forest {
    //Question-Link :: https://www.codingninjas.com/studio/problems/n-forest_6570177

    /*
        Pattern Type  ==>   * * *
                            * * *
                            * * *


     */

    public static void main(String[] args) {
        nForest(4);
    }

    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
