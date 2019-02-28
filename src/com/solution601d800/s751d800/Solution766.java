package com.solution601d800.s751d800;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-24 01:45
 **/
public class Solution766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1])
                    return false;
            }
        }

        return true;
    }
}
