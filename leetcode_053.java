package cn.cc.org;

public class leetcode_53 {
	public int maxSubArray(int[] nums) {
        // 参数校验
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException();
        }

        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i : nums) {
            // 当前和小于0，就将当前值赋给curSum
            if (curSum <= 0){
                curSum = i;
            }
            // 否则进行累加
            else {
                curSum += i;
            }

            // 保存较大的值
            if (max < curSum) {
                max = curSum;
            }
        }

        return max;
    }
}
