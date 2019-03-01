package com.solution601d800.s651d700;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-01 04:51
 **/
/*
给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。

        找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)

        示例 1:

       [[0,0,1,0,0,0,0,1,0,0,0,0,0],
        [0,0,0,0,0,0,0,1,1,1,0,0,0],
        [0,1,1,0,1,0,0,0,0,0,0,0,0],
        [0,1,0,0,1,1,0,0,1,0,1,0,0],
        [0,1,0,0,1,1,0,0,1,1,1,0,0],
        [0,0,0,0,0,0,0,0,0,0,1,0,0],
        [0,0,0,0,0,0,0,1,1,1,0,0,0],
        [0,0,0,0,0,0,0,1,1,0,0,0,0]]
        对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。

        示例 2:

        [[0,0,0,0,0,0,0,0]]
        对于上面这个给定的矩阵, 返回 0。

        注意: 给定的矩阵grid 的长度和宽度都不超过 50。
*/
public class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=1;
        int r=grid.length;
        int c=grid[0].length;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if (grid[i][j]==1){
                    ans=Math.max(ans,areaDfs(grid,i,j));
                }
            }
        }
        return ans;
    }
    private int areaDfs(int[][]grid,int i,int j){
        if (i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
            grid[i][j]=0;
            return 1+areaDfs(grid,i-1,j)+areaDfs(grid,i+1,j)+areaDfs(grid,i,j-1)+areaDfs(grid,i,j+1);
        }
        return 0;
    }
}
