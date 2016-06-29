package cn.cc.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class leetcode_15 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet hs = new HashSet(); //��󲻻����ظ�

        for(int i=0; i<nums.length; i++) {

            int left = i + 1;  //��ؼ��ĵط����������취ȥ�������left=0,���ظ�����
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
                    //break;   //��ÿ��Ϊ���㣬�𰸿����ж��
                    left++;    
                    right--;
                }
            }
        }
        return new ArrayList(hs);
    }
}
