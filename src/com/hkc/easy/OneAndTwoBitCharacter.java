/**
 *
 * 717. 1比特与2比特字符
 *
 * 题目描述：有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 *
 * 解决思路：从第倒数二位开始依次判断，如果当前位是偶数位（倒着数）且为0，必定是一比特字符。如果是奇数为且为0，则一定不是一比特字符
 * 如果全为1（除了最后一位），位数为奇数一定是一比特字符，反之就不是。
 *
 */

package com.hkc.easy;

public class OneAndTwoBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {

        if(bits.length==1)
            return true;
        int n = 2 ; //定义初始位数（倒着数）
        for(int i = bits.length-2;i>=0;i--,n++){
            //如果当前位是偶数位（倒着数）且为0，必定是一比特字符。
            if(n%2==0){
                if(bits[i]==0)
                    return true;
            }
            //如果是奇数为且为0，则一定不是一比特字符
            else{
                if(bits[i]==0)
                    return false;
            }
        }
        if(n%2==0)
            return true ;
        return false ;
    }
}
