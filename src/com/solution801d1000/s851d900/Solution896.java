package com.solution801d1000.s851d900;

import java.util.Arrays;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-02 03:54
 **/
/*
如果数组是单调递增或单调递减的，那么它是单调的。

        如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。

        当给定的数组 A 是单调数组时返回 true，否则返回 false。



        示例 1：

        输入：[1,2,2,3]
        输出：true
        示例 2：

        输入：[6,5,4,4]
        输出：true
        示例 3：

        输入：[1,3,2]
        输出：false
        示例 4：

        输入：[1,2,4,5]
        输出：true
        示例 5：

        输入：[1,1,1]
        输出：true


        提示：

        1 <= A.length <= 50000
        -100000 <= A[i] <= 100000*/

public class Solution896 {
    public boolean isMonotonic(int[] A) {
        int[] A1=new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            A1[i]=A[i];
        }
        Arrays.sort(A1);
        int j=0;
        if (A[0]<A[A.length-1]){
            for (int i = 0; i <A.length ; i++) {
                if (A[i]!=A1[i]) return false;
            }
            return true;
        }else if (A[0]>A[A.length-1]){
            for (int i = A.length-1; i >=0 ; i--) {
                if (A[i]!=A1[j]){
                    return false;
                }
                j++;
            }
            return true;
        }else if (A[0]==A[A.length-1]){
            for (int i = 0; i < A.length-1; i++) {
                if (A[i]!=A[0]) return false;
            }
            return true;
        }
        return false;
    }
}
