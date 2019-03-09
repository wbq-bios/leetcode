package com.solution401d600.s551d600;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-09 07:42
 **/
/*

从索引0开始长度为N的数组A，所有游戏0到N - 1的所有整数。找到并返回最大的集合S，S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }且遵守以下的规则。

        选择假设为索引i的元素A[i]为S的第一个元素，S的下一个元素应该是A[A[i]]，的英文之后A[A[A[i]]]...以此类推，添加不断直到S出现重复的元素。

        示例1：

        输入： A = [5,4,0,3,1,6,2]
        输出： 4
        解释：
        A [0] = 5，A [1] = 4，A [2] = 0，A [3] = 3，A [4] = 1，A [5] = 6，A [6] = 2。

        其中一种最长的S [K]：
        S [0] = {A [0]，A [5]，A [6]，A [2]} = {5,6,2,0}
        注意：

        N的英文[1, 20,000]之间的整数。
        A中不含有重复的元素。
        A的中大小元素在[0, N-1]之间。
*/


public class Solution565 {
    public int arrayNesting(int[] nums) {
        Map<Integer,Integer> res=new HashMap<>();
        int ans=0;
        int count=0;
        int temp;
        for (int j = 0; j <nums.length ; j++) {
            temp=nums[j];
            while (!res.containsKey(temp)){
                res.put(temp,j);
                count+=1;
                temp=nums[temp];
            }
            ans=Math.max(count,ans);
            count=0;
        }
        return ans;
    }
}
