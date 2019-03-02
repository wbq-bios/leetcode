package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-20 20:44
 **/
public class Solution5 {

    public static String longestPalindrome(String s) {
//        "abcdbbfcba"
//        1表示是回文，0表示不是
        if (s.length()==0||s==null) return  "";
        int maxLength=0;
        int n=s.length();
        int left=0;
        int right=0;
        int [][] res=new int[n][n];
        for (int i=0;i<n;i++){
            //字符本身肯定是回文
            res[i][i]=1;
            for (int j = 0; j <i; j++) {
                //判断只有2个字符的情况
                if (i-j==1 && s.charAt(i)==s.charAt(j)){
                    res[j][i]=1;
                }
                //判断3个和3个以上的情况
                if (s.charAt(i)==s.charAt(j)&&
                    res[j+1][i-1]==1 && i-j>1){

                    res[j][i]=1;
                }
                if (res[j][i]==1 && maxLength < i - j + 1) {
                    maxLength = i - j + 1;
                    left = j;
                    right = i;
                }
            }

        }
        return s.substring(left, right+ 1);
    }

}
