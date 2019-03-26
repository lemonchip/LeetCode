package com.hkc.medium;

import com.hkc.data_structure.ListNode;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {


        ListNode root = head ;

        if(head!=null&&head.next!=null) {
            root = head.next ;
            ListNode temp = null;
            ListNode swapTemp = null;
            // ListNode swapTempL;
            ListNode a = head;

            while (head != null && head.next != null) {

                temp = head.next;
                swapTemp = temp.next;

                a.next = temp;
                temp.next = head;
                head.next = swapTemp;

                a = head;
                head = swapTemp;


            }
        }
        return root ;
    }
}
