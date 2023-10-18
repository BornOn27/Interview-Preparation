package main._01_star_patterns;

public class _06_ReverseNumberTriangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889

    /*
        Pattern Type  ==>   1 2 3 4
                            1 2 3
                            1 2
                            1
     */

    public static void main(String[] args) {
        nNumberTriangle(5);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
