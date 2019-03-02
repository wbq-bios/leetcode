package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-26 21:56
 **/
/*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

        示例 1:

        输入: 121
        输出: true
        示例 2:

        输入: -121
        输出: false
        解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
        示例 3:

        输入: 10
        输出: false
        解释: 从右向左读, 为 01 。因此它不是一个回文数。*/

public class Solution9 {
    public boolean isPalindrome(int x) {
        int curr=0;
        int rest=x;
        int ans=0;
        if (x<0)return false;
        while (rest!=0){
            curr=rest%10;
            rest=rest/10;
            ans=ans*10+curr;
        }
        if (ans==x){
            return true;
        }
        return false;
    }

}
