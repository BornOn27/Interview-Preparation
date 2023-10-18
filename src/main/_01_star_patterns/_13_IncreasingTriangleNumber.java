package main._01_star_patterns;

public class _13_IncreasingTriangleNumber {
    //Question-Link :: https://www.codingninjas.com/studio/problems/increasing-number-triangle_6581893

    /*
        Pattern Type  ==>       1
                                2 3
                                4 5 6
                                7 8 9 10
     */
    public static void main(String[] args) {
        nNumberTriangle(4);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start+ " ");
                start++;
            }
            System.out.println();
        }
    }
}
