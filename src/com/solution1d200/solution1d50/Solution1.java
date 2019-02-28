package com.solution1d200.solution1d50;

import java.util.HashMap;
import java.util.Map;
/*

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

        示例:

        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]
*/

public class Solution1 {

/*    //暴力法 128 ms	27.5 MB
    public int[] twoSum() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] ans = new int[2];
        int first = 0;
        int second = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target && i!=j){
                    ans[0]=j;
                    ans[1]=i;
                }

            }
        }
        return ans;
    }
*/

//  hash表方法
//  9 ms	31.4 MB
    public int[] twoSum() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] ans = new int[2];
        Map<Integer,Integer> res=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int odd=target-nums[i];
            if (res.containsKey(odd)){
                return new int[] { res.get(odd), i };
            }
            res.put(nums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");

    }







//    public int[] twoSum() {
//        int[] nums={-1,-2,-3,-4,-5};
//        int target =-8;
//        int targetAbs=target>0?target:-target;
//        int[] ans= new int[2];
//        int[] num=new int[targetAbs+1];
//        int first = 0;
//        int second=0;
//        //找到能相加得到target的加数，因为会重复 所以除以二只取一半
//        for (int i = 0; i <=targetAbs; i++) {
//            num[i]=i;
//        }
//        for (int i = 0; i <num.length ; i++) {
//            for (int j = 0; j <nums.length ; j++) {
//                if (nums[j]==num[i]){
//                    int other=target-num[i];
//                    for (int k = 0; k <nums.length ; k++) {
//
//                        if (nums[k]==other){
//                            first=j;
//                            second=k;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        ans[0]=first;
//        ans[1]=second;
//        return ans;
//    }
}
