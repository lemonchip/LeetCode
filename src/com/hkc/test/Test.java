package com.hkc.test;

import com.hkc.data_structure.ListNode;
import com.hkc.easy.OneAndTwoBitCharacter;
import com.hkc.easy.RemovingElements;
import com.hkc.easy.SearchInsert;
import com.hkc.medium.AddTwoNumbers;

public class Test {
    public static void main(String[] args) {
     /*   OneAndTwoBitCharacter oneAndTwoBitCharacter = new OneAndTwoBitCharacter();
        int[] bits = {1,1,1,0};
       Boolean restul = oneAndTwoBitCharacter.isOneBitCharacter(bits);
       System.out.println(restul);*/
      //testRemoveElement();
      //  testSearchInsert();
        testAddTwoNumbers();

    }

    public static  void  testRemoveElement(){
        RemovingElements removingElements = new RemovingElements();
        int[] nums = {0,1,2,2,3,0,4,2};
        int a = removingElements.removeElement(nums,2);
        System.out.println(a);
    }

    public static void testSearchInsert(){
        SearchInsert  searchInsert = new SearchInsert();
        int[] nums = {1,3,5,6} ;
        int rest = searchInsert.searchInsert(nums,7);
        System.out.println(rest);
    }

    public static void testAddTwoNumbers(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode ;
        ListNode listNode1 =new  ListNode(9) ;
        ListNode listNode2 =new  ListNode(9) ;
/*        int[] num1 = {2,4,3} ;
        int[] num2 = {5,6,4} ;*/
        int[] num1 = {9,8,1} ;
        int[] num2 = {9,2} ;
        int i = 1 ;
        int j = 1 ;
        while(i<num1.length){
            ListNode temp1 = listNode1 ;
            while (temp1.next!=null) {

                temp1 = temp1.next ;
            }
            temp1.next = new ListNode(num1[i]);
            i++;
        }
        while(j<num2.length){
             ListNode temp = listNode2 ;
             while (temp.next!=null) {
               //  new ListNode(num2[j]).next = listNode2;
               //  listNode2 = listNode2.next;
                 temp = temp.next ;
             }
             temp.next = new ListNode(num2[j]);
             j++;
        }
         listNode = addTwoNumbers.addTwoNumbers(listNode1,listNode2);

         while (listNode!=null){
             System.out.println(listNode.val);
             listNode = listNode.next ;
         }
    }
}
