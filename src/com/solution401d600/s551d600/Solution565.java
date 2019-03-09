package com.solution401d600.s551d600;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wbq
 * @create: 2019-03-09 07:42
 **/
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
