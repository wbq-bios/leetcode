package com.solution801d1000.solution951d1000;

import java.util.*;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-22 21:00
 **/
public class Solution969 {
    public List<Integer> pancakeSort(int[] A) {

        List<Integer> ans=new LinkedList<>();
        int curEndIndex = A.length - 1;

        if (A == null || A.length < 2) {
            return ans;
        }
        while (curEndIndex > 0) {
            int curMaxIndex = getCurMaxIndex(A, curEndIndex);
            if (curMaxIndex != curEndIndex) {
                // get the cur max to the 0-th index.
                Pancake(A, 0, curMaxIndex);
                ans.add(curMaxIndex + 1);
                // get the cur max to curEndIndex so everything after curEndIndex (inclusive) is sorted
                Pancake(A, 0, curEndIndex);
                ans.add(curEndIndex + 1);
            }
            curEndIndex--;
        }
        return ans;
    }
    private int getCurMaxIndex(int[] A, int endIndex) {
        int max = A[0];
        int maxIndex = 0;
        for (int i = 1; i <= endIndex; i++) {
            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private void Pancake(int[] A,int start,int end){
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return;
    }
}
