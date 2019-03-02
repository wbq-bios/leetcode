package com.solution1d200.s1d50;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-20 02:11
 **/

/*

给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

        请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

        你可以假设 nums1 和 nums2 不会同时为空。

        示例 1:

        nums1 = [1, 3]
        nums2 = [2]

        则中位数是 2.0
        示例 2:

        nums1 = [1, 2]
        nums2 = [3, 4]

        则中位数是 (2 + 3)/2 = 2.5


        a1,a2,a3...ai//ai+1,...am
        b1,b2,b3...bj//bj+1.,,bn
*/

        public class Solution4 {
            public double findMedianSortedArrays() {
                int[] A={- 49,33,35,42}; int[] B={- 26};
                int m = A.length;
                int n = B.length;

                if (m > n) { // to ensure m<=n
                    int[] temp = A; A = B; B = temp;
                    int tmp = m; m = n; n = tmp;
                }
                int iMin=0;int iMax=m; int half=(m+n+1)/2;
                while (iMin<=iMax){
                    int i=(iMin+iMax)/2;
                    int j=half-i;
                    if (i>iMin && A[i-1]>B[j]){ //i太大了
                        iMax=i-1;
                    }
                    else if (i<iMax && B[j-1]>A[i]){//i太小了
                        iMin=i+1;
                    }
                    else { //i正好
                        int maxleft=0;
                        if (i==0){maxleft=B[j-1];}
                        else if (j==0){maxleft=A[i-1];}
                        else {maxleft=Math.max(A[i-1],B[j-1]);}
                        if ( (m + n) % 2 == 1 ) { return maxleft; }

                        int minRight = 0;
                        if (i == m) { minRight = B[j]; }
                        else if (j == n) { minRight = A[i]; }
                        else { minRight = Math.min(B[j], A[i]); }
                        return (maxleft + minRight) / 2.0;
                    }
                }
                return 0.0;
            }
        }