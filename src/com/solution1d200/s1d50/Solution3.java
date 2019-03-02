package com.solution1d200.s1d50;

import java.util.HashSet;
import java.util.Set;
/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/
public class Solution3 {

    public int lengthOfLongestSubstring() {
//    耗时 60ms，内存40m
        String s ="dvdf";
        int n =s.length();
        int ans=0;
        int i=0;
        int j=0;
        Set<Character> res =new HashSet<>();
        while (i<n&&j<n){
            if (!res.contains(s.charAt(j))){
                res.add(s.charAt(j));
                j++;
                ans=Math.max(ans,j-i);
            }else {
                res.remove(s.charAt(i));
                i++;
            }

        }
        return ans;
    }
/*
    这个是传统暴力法 优点是很容易理清思路，缺点是时间复杂度实在太慢了

    耗时 超出限制

   public int lengthOfLongestSubstring() {

        String s ="11234";
        int n =s.length();
        int ans=0;
        for (int i = 0; i <n ; i++) {
            for (int j=i+1; j<=n;j++){
                if (allUnique(s,i,j)) ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
    public boolean allUnique(String s, int start, int end){
        Set<Character> res =new HashSet<>();
        for (int i = start; i <end ; i++) {
            if (res.contains(s.charAt(i))){
                return false;
            }
            res.add(s.charAt(i));
        }
        return true;
    }*/

/*  刷题时的大神版
    public int lengthOfLongestSubstring(String s ) {
//    耗时 26ms,内存29m
        int max = 0;
        int left = 0;
        int right = 0;
        for (; right < s.length(); ++right) {
            char rightC = s.charAt(right);
            for (int index = left; index < right; ++index) {
                if (s.charAt(index) == rightC) {
                    max = (right - left) > max ? (right - left) : max;
                    left = index + 1;
                    break;
                }
            }
        }
        max = (right - left) > max ? (right - left) : max;
        return max;
    }
    */
}
