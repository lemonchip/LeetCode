

package com.hkc.easy;

/**
 * 27.移除元素
 *
 *      题目描述：给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *      解决思路： 用头尾两个指针，尾指针先走，如果尾指针是给定要删除的值，尾指针向前移，然后头指针向后找，如果是要删除的元素，与为
 *      指针的元素交换位置。最后得到一个删除指定元素的数组
 *
 */
public class RemovingElements {

    public int removeElement(int[] nums, int val) {

        if(nums.length == 0)
            return 0 ;
        int num = 0;//要删除元素的个数
        int temp ;
        for(int i =0,j = nums.length - 1;i<=j;j--){
            if(nums[j]!=val){
                for(;i<j;i++){
                    if(nums[i]==val){
                        //如果是要删除的元素就交换位置
                        temp = nums[j] ;
                        nums[j] = nums[i]   ;
                        nums[i] = temp ;
                        num++;
                        break;
                    }
                }
            }
            else num++ ;
        }

        for(int i = 0 ; i<nums.length - num ; i++)
            System.out.println(nums[i]);
        return nums.length - num ;
    }

}
