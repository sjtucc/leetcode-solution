package cn.cc.org;

import java.util.ArrayList;
import java.util.Iterator;

public class leetcode_27 {
	 public int removeElement(int[] nums, int val) {
	        if(nums==null || nums.length==0)
	            return 0;
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        for(int i=0; i<nums.length; i++) {
	            al.add(nums[i]);
	        }

	        /*for(int i=0; i<al.size(); i++) {
	            if(al.get(i)==val) {
	                al.remove(i);
	                i--;    //删除一个数后，后面的数字全部向前移
	            }   
	        }*/
	        for(Iterator<Integer> it=al.iterator(); it.hasNext();) {
	            if(it.next()==val)
	                it.remove();
	        }


	        System.out.println(al);
	        return al.size();
	    }
}
