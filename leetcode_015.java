package cn.cc.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class leetcode_15 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet hs = new HashSet(); //最后不会有重复

        for(int i=0; i<nums.length; i++) {

            int left = i + 1;  //最关键的地方，如果是想办法去掉定点后left=0,会重复计算
            int right = nums.length-1;
            while(left < right) {
                if(nums[left] + nums[right] > -nums[i]) {
                    right--;
                }
                else if(nums[left] + nums[right] < -nums[i]) {
                    left++;
                }
                else {
                    List li = new ArrayList();
                    li.add(nums[i]);
                    li.add(nums[left]);
                    li.add(nums[right]);
                    hs.add(li);
                    //break;   //以每个为定点，答案可能有多个
                    left++;    
                    right--;
                }
            }
        }
        return new ArrayList(hs);
    }
}
