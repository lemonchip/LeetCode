package com.hkc.medium;

/**
 * 2. 两数相加
 *
 *   题目描述 ：给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 *            如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 *            您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *   解决思路 ：按节点（位）相加，把结果放入新链表。注意设置进位标志。
 *
 */

import com.hkc.data_structure.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      //判断空指针
        if(l1==null|| l2==null)
            return new ListNode(-1) ;

        //设置新链表的头节点
        ListNode l3 = new ListNode(0) ;
        //临时节点
        ListNode temp  ;
        int sum = 0;
        //进位标志
        int flag = 0;

        do{
            sum = l1.val+l2.val + flag;

            if(sum<10){
                temp = l3 ;

                //寻找l3尾节点，在尾节点添加结果
                while (temp.next!=null)
                {
                    temp = temp.next ;
                }
                temp.next= new ListNode(sum);
                flag = 0 ;

            }else{
                sum = sum % 10 ;
                temp = l3 ;
                while (temp.next!=null)
                {
                    temp = temp.next ;
                }
                temp.next= new ListNode(sum);
                flag = 1 ;

            }
            l1 = l1.next ;
            l2 = l2.next ;
            //如果位数不一样，把少位数的链表的高位置0
            if(l1==null&&l2!=null){
                l1 = new ListNode(0);
            }
            if (l1!=null&&l2==null){
                l2 = new ListNode(0);
            }

        }while(l1!=null&&l2!=null);
        //最后一位进位
        if(flag==1){
            temp = l3 ;
            while (temp.next!=null)
            {
                temp = temp.next ;
            }
            temp.next= new ListNode(1);

        }

        return l3.next ;
    }
}
