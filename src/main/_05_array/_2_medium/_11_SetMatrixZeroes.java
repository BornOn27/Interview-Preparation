package main._05_array._2_medium;

import main._00_helper.Util;

import java.util.ArrayList;
import java.util.List;

public class _11_SetMatrixZeroes {
    //Question-Link :: https://leetcode.com/problems/set-matrix-zeroes/description/

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new _11_SetMatrixZeroes().setZeroes(matrix);
        Util.printArr(matrix);
    }

    public void setZeroes(int[][] matrix) {
        //Get all the Zeros
        List<int[]> indexes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    indexes.add(new int[]{i, j});
                }
            }
        }

        //Make call to set Zeros
        for (int[] index : indexes) {
            setZeros(matrix, index);
        }
    }

    private void setZeros(int[][] matrix, int[] index){
        //Column Major
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][index[1]] = 0;
        }

        //Row Major
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[index[0]][i] = 0;
        }
    }


}
