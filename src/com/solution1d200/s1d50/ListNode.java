package com.solution1d200.s1d50;//Solution2所需要的数据结构

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public void getString(){
        System.out.println("当前"+val+"，中间"+next.val+"最后"+next.next.val);
    }
}
