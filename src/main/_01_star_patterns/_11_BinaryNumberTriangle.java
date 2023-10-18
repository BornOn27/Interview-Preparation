package main._01_star_patterns;

public class _11_BinaryNumberTriangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/binary-number-triangle_6581890

    /*
        Pattern Type  ==>       1
                                0 1
                                1 0 1
                                0 1 0 1
     */

    public static void main(String[] args) {
        nBinaryTriangle(5);
    }

    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if((i & 1) == 0){
                //Even Number
                start = 0;
            }

            for (int j = 0; j < i; j++) {
                System.out.print(start+" ");
                start = start ^ 1;
            }
            System.out.println();
        }
    }
}
