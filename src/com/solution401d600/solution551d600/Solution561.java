package com.solution401d600.solution551d600;

import java.util.Arrays;
/*

给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

        示例 1:

        输入: [1,4,3,2]

        输出: 4
        解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
        提示:

        n 是正整数,范围在 [1, 10000].
        数组中的元素范围在 [-10000, 10000].
*/


public class Solution561 {
    public int arrayPairSum() {
        int[] nums={21,52,1,21,34,94};
        int length=nums.length;
        int sum=0;
        //排序
        Arrays.sort(nums);
        for (int i = 0; i <length ;i+=2 ) {
           sum+=nums[i];
        }
        return sum;
    }
}