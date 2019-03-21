package com.hkc.test;

import com.hkc.easy.OneAndTwoBitCharacter;
import com.hkc.easy.RemovingElements;
import com.hkc.easy.SearchInsert;

public class Test {
    public static void main(String[] args) {
     /*   OneAndTwoBitCharacter oneAndTwoBitCharacter = new OneAndTwoBitCharacter();
        int[] bits = {1,1,1,0};
       Boolean restul = oneAndTwoBitCharacter.isOneBitCharacter(bits);
       System.out.println(restul);*/
      //testRemoveElement();
        testSearchInsert();

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
}
