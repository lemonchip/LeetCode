package com.hkc.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sumlist = new ArrayList<List<Integer>>();

        List<Integer> sum ;

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1 ;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        sum=Arrays.asList(nums[i],nums[j],nums[k]);
                        sumlist.add(sum);
                    }
                }
            }
        }
    return sumlist ;
    }
}
