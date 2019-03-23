package com.hkc.medium;

/**
 *   11. 盛最多水的容器
 *          题目描述: 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画
 *                   n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它
 *                   们与 x 轴共同构成的容器可以容纳最多的水。
 *                   说明：你不能倾斜容器，且 n 的值至少为 2。
 *           解决思路：暴力求解，一个一个的求取最大值 。
 */

public class MaxArea {


    public int maxArea(int[] height) {
        int max = 0;//初始化最大容量
        int area = 0 ;  //乘积

        for(int i = 0;i<height.length-1;i++){
            for(int j = i+1;j<height.length;j++){
                if(height[i]<height[j]){
                    area = height[i] * (j-i) ;
                }
                else
                {
                    area = height[j] * (j-i) ;
                }
                if(area>max){
                    max = area ;
                }
            }
        }
        return max ;
    }
}
