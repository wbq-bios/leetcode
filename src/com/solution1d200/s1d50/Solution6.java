package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-26 03:58
 **/
/*

将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

        比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

        L   C   I   R
        E T O E S I I G
        E   D   H   N
        之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

        请你实现这个将字符串进行指定行数变换的函数：

        string convert(string s, int numRows);
        示例 1:

        输入: s = "LEETCODEISHIRING", numRows = 3
        输出: "LCIRETOESIIGEDHN"
        示例 2:

        输入: s = "LEETCODEISHIRING", numRows = 4
        输出: "LDREOEIIECIHNTSG"
        解释:

        L     D     R
        E   O E   I I
        E C   I H   N
        T     S     G
*/

public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuffer[] ansList = new StringBuffer[numRows];
        for (int i = 0; i < ansList.length; i++) ansList[i] = new StringBuffer();
        String ans="";
        int lineNum=0; int reverse=1;//翻转 1自上往下 -1自下往上
        for (int i = 0; i <s.length() ; i++) {
            if (lineNum==0){
                ansList[lineNum].append(s.charAt(i));
                reverse=1;
                lineNum++;
            }
            else if (lineNum==numRows-1){
                ansList[lineNum].append(s.charAt(i));
                lineNum--;
                reverse=-1;
            }
            else {
                ansList[lineNum].append(s.charAt(i));
                if (reverse==1){
                    lineNum++;
                }else if (reverse==-1){
                    lineNum--;
                }

                }
            }
        for (int i = 1; i <numRows ; i++) {
             ans=ansList[0].append(ansList[i]).toString();
        }
        return ans;
        }
}
