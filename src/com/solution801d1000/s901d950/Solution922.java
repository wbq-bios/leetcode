package com.solution801d1000.s901d950;

/**
 * @author: wbq
 * @create: 2019-02-19 21:24
 **/

/*
给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

        对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

        你可以返回任何满足上述条件的数组作为答案。



        示例：

        输入：[4,2,5,7]
        输出：[4,5,2,7]
        解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。


        提示：

        2 <= A.length <= 20000
        A.length % 2 == 0
        0 <= A[i] <= 1000
*/

public class Solution922 {
    public int[] sortArrayByParityII() {
        int[] A ={4,2,5,7};
        int[] ans=new int[A.length];
        int p=0;//偶数指标
        int q=1;//奇数指标
        for (int i = 0; i <A.length ; i++) {
            if (A[i]%2==0){
                ans[p]=A[i];
                p+=2;
            }else {
                ans[q]=A[i];
                q+=2;
            }
        }
        return ans;
    }
}
