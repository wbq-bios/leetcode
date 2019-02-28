package com.solution1d200.solution1d50;

/**
 * @description:
 * 终于做到第十题了！！！！虽然这对大多数人是很无所谓的事情，
 * 但对于我个人来说，这毕竟是个里程牌，当然他也不是很大，
 * 毕竟我们的征途可是星辰大海啊！！！！！！
 * @author: wbq
 * @create: 2019-03-01 03:42
 **/

/*
给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。

        '.' 匹配任意单个字符。
        '*' 匹配零个或多个前面的元素。
        匹配应该覆盖整个字符串 (s) ，而不是部分字符串。

        说明:

        s 可能为空，且只包含从 a-z 的小写字母。
        p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
        示例 1:

        输入:
        s = "aa"
        p = "a"
        输出: false
        解释: "a" 无法匹配 "aa" 整个字符串。
        示例 2:

        输入:
        s = "aa"
        p = "a*"
        输出: true
        解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。
        示例 3:

        输入:
        s = "ab"
        p = ".*"
        输出: true
        解释: ".*" 表示可匹配零个或多个('*')任意字符('.')。
        示例 4:

        输入:
        s = "aab"
        p = "c*a*b"
        输出: true
        解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。
        示例 5:

        输入:
        s = "mississippi"
        p = "mis*is*p*."
        输出: false
*/

public class Solution10 {
    public boolean isMatch(String s, String p) {
        //为什么加1？ 因为这不是代表s和p的索引，而是代表s中0到第i个，p中0到第j个的距离
        //例如 s【a，b，c，d】，p【e，f，g】
        // dp[2][3]代表的是s中0到2这中间的字符串和p中第0个到第3个的字符串比较后的结果。
        // 既 【a，b】和【e，f，g】比较后得出的结果。
        boolean dp[][]=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;//两个都为空的时候肯定是true；
        //当s为空，p不为空的时候
        for (int i = 1; i <=p.length() ; i++) {
            //p中*永远不可能是第一个字符，
            if (p.charAt(i-1)=='*'){//i-1代表在p中的当前字符。
                dp[0][i]=dp[0][i-2];//取决于上一个的结果 例如 s：""，p：a*
            }
        }
        for (int i = 1; i <=s.length(); i++) {
            for (int j = 1; j <=p.length() ; j++) {
                if (p.charAt(j-1)==s.charAt(i-1)||p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }else if (p.charAt(j-1)=='*'){
                    if (p.charAt(j-2)==s.charAt(i-1)||p.charAt(j-2)=='.'){//s:a,p: a*
                        dp[i][j]=dp[i-1][j]||dp[i][j-2];
                    }else {
                        dp[i][j]=dp[i][j-2];
                    }
                }
            }
        }
return dp[s.length()][p.length()];
    }


}
