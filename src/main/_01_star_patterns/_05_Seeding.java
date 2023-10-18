package main._01_star_patterns;

public class _05_Seeding {
    //Question-Link :: https://www.codingninjas.com/studio/problems/seeding_6581892

    /*
        Pattern Type  ==>   * * *
                            * *
                            *
     */

    public static void main(String[] args) {
        seeding(3);
    }

    public static void seeding(int n) {
        // Write your code here
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
