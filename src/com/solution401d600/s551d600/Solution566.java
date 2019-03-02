package com.solution401d600.s551d600;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-27 07:05
 **/
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int y=nums.length; int x=nums[0].length;
        int tempy=0; int tempx=0;
        int[][] ans=new int[r][c];
        if (x*y!=r*c){
            return nums;
        }else {

            for (int i = 0; i <y ; i++) {
                for (int j = 0; j <x ; j++) {
                    ans[tempy][tempx]=nums[i][j];
                    if (tempx==c-1){
                        tempy++;
                        tempx=0;
                    }else {
                        tempx++;
                    }
                }
            }
        }
        return ans;
    }
}
