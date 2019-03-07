package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-03 04:28
 **/
/*

编写一个函数来查找字符串数组中的最长公共前缀。

        如果不存在公共前缀，返回空字符串 ""。

        示例 1:

        输入: ["flower","flow","flight"]
        输出: "fl"
        示例 2:

        输入: ["dog","racecar","car"]
        输出: ""
        解释: 输入不存在公共前缀。
        说明:

        所有输入只包含小写字母 a-z 。
*/

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer ans=new StringBuffer();
        int min=99999;
        int minI=0;
        if (strs==null||strs.length==0){return ans.toString();}
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()<min){min=strs[i].length(); minI=i;}
        }
        for (int i = 0; i <strs[minI].length() ; i++) {
            char temp=strs[0].charAt(i);
            for (int j = 1; j <strs.length ; j++) {
                if (temp!=strs[j].charAt(i)){
                    return ans.toString();
                }
            }
            ans.append(temp);
        }
        return ans.toString();
    }
}
