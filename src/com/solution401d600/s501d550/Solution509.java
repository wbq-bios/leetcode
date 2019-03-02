package com.solution401d600.s501d550;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-20 18:14
 **/
public class Solution509 {

    private int[] res=new int[31];

    public int fib(int N) {
        res[0]=0;res[1]=1;
        for(int i=2;i<=30;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[N];

    }
}
