package com.hkc.test;

import com.hkc.data_structure.ListNode;
import com.hkc.easy.OneAndTwoBitCharacter;
import com.hkc.easy.RemovingElements;
import com.hkc.easy.SearchInsert;
import com.hkc.medium.*;

import java.util.List;

public class Test {
    public static void main(String[] args) {
     /*   OneAndTwoBitCharacter oneAndTwoBitCharacter = new OneAndTwoBitCharacter();
        int[] bits = {1,1,1,0};
       Boolean restul = oneAndTwoBitCharacter.isOneBitCharacter(bits);
       System.out.println(restul);*/
      //testRemoveElement();
      //  testSearchInsert();
      //  testAddTwoNumbers();
       //     testMaxArea();
        //testThreeSum();
       // testSwapPairs();
        testCombinationSum();

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


    public  static  void testMaxArea(){
        MaxArea maxArea = new MaxArea();
        //int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {1,1};
        int max = maxArea.maxArea(height);
        System.out.println(max);
    }

    public static void testThreeSum(){

        ThreeSum threeSum = new ThreeSum();
          int[] nums = {-1, 0, 1, 2, -1, -4} ;
       // int[] nums = {1, -1, 0,-1, 0, 3, -3, -1, -4} ;
        List<List<Integer>> sumlist = threeSum.threeSum(nums);

        for(List<Integer> s :sumlist){
            for(Integer n :s){
                System.out  .print(n);
            }
            System.out.println("");
        }

     }

     public static void testSwapPairs(){

         SwapPairs swapPairs = new SwapPairs();
         int[] num1 = {1,2,3,4} ;
         int i = 1 ;
         ListNode listNode1 = new  ListNode(1) ;
         while(i<num1.length){
             ListNode temp1 = listNode1 ;
             while (temp1.next!=null) {

                 temp1 = temp1.next ;
             }
             temp1.next = new ListNode(num1[i]);
             i++;
         }
         ListNode listNode = swapPairs.swapPairs(listNode1) ;

         while (listNode!=null){
             System.out.println(listNode.val);
             listNode = listNode.next ;
         }
     }

    public static void testCombinationSum(){
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2,3,5};
        int target = 8 ;
       List<List<Integer>> result = combinationSum.combinationSum(candidates,target);
                for(List<Integer> g : result){
                    System.out.println(" ");
                    for(Integer i : g){
                        System.out.print(i);
                    }
                }

    }

}
