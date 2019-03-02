package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-26 05:45
 **/
/*

给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

        示例 1:

        输入: 123
        输出: 321
        示例 2:

        输入: -123
        输出: -321
        示例 3:

        输入: 120
        输出: 21
        注意:

        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
*/

public class Solution7 {
    public int reverse(int x) {
        int curr=0;int rest=x; int ans=0;
        //-2143847412
        while(rest != 0){
            curr=rest%10;
            rest=rest/10;
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && curr > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && curr < -8)) return 0;
            ans=ans*10+curr;
        }
        return ans;
    }
}
