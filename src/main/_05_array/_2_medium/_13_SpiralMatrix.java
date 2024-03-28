package main._05_array._2_medium;

import java.util.ArrayList;
import java.util.List;

public class _13_SpiralMatrix {
    //Question-Link :: https://leetcode.com/problems/spiral-matrix/description/

    public static void main(String[] args) {
        System.out.println(new _13_SpiralMatrix().spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    /**
     *  Print -
     *      Left to Right
     *      Top to Bottom
     *      Right to Left
     *      Bottom to Top
     *
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0, right = matrix[0].length-1, bottom = matrix.length-1, left = 0;

//        System.out.println("top "+top+" right "+right+" bottom "+bottom+" left "+left);

        while ((top <= bottom) && (left <= right)){
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

//            System.out.println("top "+top+" right "+right+" bottom "+bottom+" left "+left);
        }

        return result;
    }
}
