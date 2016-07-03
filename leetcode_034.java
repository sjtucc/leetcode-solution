package cn.cc.org;

public class leetcode_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];   
        if(nums==null || nums.length==0)
            return nums;
        if(nums[0] == target) {   //如果第一个数就等于target
            int i = 0;
            while((i+1)<=nums.length-1 && nums[i+1] == target) {
                i++;
            }
            result[0] = 0;
            result[1] = i;
            return result;
        }
        int index = 0;  //等于target的那个数组索引
        int left = 0;   //二分法查找左边值
        int right = nums.length-1;//二分法查找右边值

        while(left < right) {   //while循环为二分法查找，
                                //虽然Arrays工具提供了二分查找方法，但自己试试。
             if(nums[(left+right)/2] == target) {
                 index = (left+right)/2;
                 break;
             }
             else if(nums[(left+right)/2] < target) {
                 left = (left+right)/2;
                 /*if((right-left)==1 && nums[right]!=target && nums[left]!=target)
                     break;*/
                 if((right-left)==1) {     //此if语句是解决二分查找相邻索引的死循环问题
                     if(nums[right]!=target && nums[left]!=target)
                         break;
                     else if(nums[right]==target) {
                         index = right;
                         break;
                     }
                     else if(nums[left]==target) {
                         index = left;
                         break;
                     }
                 }
             }
             else if(nums[(left+right)/2] > target) {
                 right = (left+right)/2;
                 if((right-left)==1) {     //此if语句是解决二分查找相邻索引的死循环问题
                     if(nums[right]!=target && nums[left]!=target)
                         break;
                     else if(nums[right]==target) {
                         index = right;
                         break;
                     }
                     else if(nums[left]==target) {
                         index = left;
                         break;
                     }
                 }
             }
        }
        if(index == 0) {    //没有与target相等的数
            result[0] = -1;
            result[1] = -1;


        } else {    //有与target相等的数
            //由于数组里可以有重复数，二分查找到不能准确找到第一个等于target的数，所以需要左右延伸
            int i = index;
            int j = index;
            while((i-1)>=0 && nums[i-1] == target) { 
                i--;
            }
            while((j+1)<=nums.length-1 && nums[j+1] == target) {
                j++;
            }
            result[0] = i;
            result[1] = j;


        }
        return result;    
    }
}
