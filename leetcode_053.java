package cn.cc.org;

public class leetcode_53 {
	public int maxSubArray(int[] nums) {
        // ����У��
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException();
        }

        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i : nums) {
            // ��ǰ��С��0���ͽ���ǰֵ����curSum
            if (curSum <= 0){
                curSum = i;
            }
            // ��������ۼ�
            else {
                curSum += i;
            }

            // ����ϴ��ֵ
            if (max < curSum) {
                max = curSum;
            }
        }

        return max;
    }
}
