package com.solution801d1000.s851d900;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-22 20:02
 **/
public class Solution867 {
/*    1,2,3,
      4,5,6
//    7,8,9

       1,4,7
       2,5,8
       3,6,9


            1,2,3
            4,5,6

            1,4
            2,5
            3,6
*/
public int[][] transpose() {
    int[][] A={{1,2,3},{4,5,6}};
    int iLength=A.length;
    int jLength=A[0].length;
    int [][] res=new int[jLength][iLength];
    for (int i = 0; i <iLength ; i++) {
        for (int j = 0; j <jLength ; j++) {
            res[j][i]=A[i][j];
        }
    }
    return res;
}
}
