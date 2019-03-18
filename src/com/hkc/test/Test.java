package com.hkc.test;

import com.hkc.easy.OneAndTwoBitCharacter;

public class Test {
    public static void main(String[] args) {
        OneAndTwoBitCharacter oneAndTwoBitCharacter = new OneAndTwoBitCharacter();
        int[] bits = {1,1,1,0};
       Boolean restul = oneAndTwoBitCharacter.isOneBitCharacter(bits);
       System.out.println(restul);
    }
}
