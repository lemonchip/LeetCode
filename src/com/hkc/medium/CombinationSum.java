package com.hkc.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> group = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int num ;
        int j ;
        for(int i = 0 ; i<candidates.length ;i++){
            num = target - candidates[i] ;
            group.add(candidates[i]) ;
            if(num==0){
                result.add(new ArrayList<Integer>(group));
                group.clear();
            }
            while(num >0){
                for( j = 0;j<candidates.length;j++){
                    if(candidates[j]==num){
                        group.add(candidates[j]);
                        result.add(new ArrayList<Integer>(group));
                        group.clear();
                        break ;
                    }
                }
                if(j==candidates.length){
                    group.add(candidates[i]);
                }
                num = num - candidates[i] ;
            }
            group.clear();
        }
        return result ;
    }

    public List<List<Integer>> combinationSum3(int[] candidates, int target) {

        List<Integer> one = new ArrayList<Integer>();
        List<List<Integer>> result  = new ArrayList<List<Integer>>();
        for(int i = 0;i<candidates.length;i++){
            one = group(candidates,target-candidates[i]);
            if(!one.isEmpty()){
                result=new ArrayList<List<Integer>>();
            }
        }

        return result ;
    }
    public List<Integer> group(int[] candidates,int num){

        ArrayList<Integer> temp = new ArrayList<>();
        if(num<0)
            return new ArrayList<Integer>() ;
        for(int i = 0 ;i<candidates.length;i++){
            if(candidates[i]==num){
                 temp.add(candidates[i]);
                 return temp ;
            }else{
                return new ArrayList<Integer>(group(candidates,num-candidates[i]));
            }
        }
        return new ArrayList<Integer>(1) ;
    }
}
