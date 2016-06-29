package cn.cc.org;

import java.util.Arrays;


public class leetcode_1 {
    private static class Node {
        int val; // ֵ
        int idx; // ֵ��Ӧ�������±�

        public Node() {
        }

        public Node(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        // �ȽϷ���
        public int compareTo(Node o) {
            if (o == null) {
                return -1;
            }
            return this.val - o.val;
        }
    }
	 public int[] twoSum(int[] nums, int target) {
	        // ���ڱ��淵�ؽ��
	        int[] result = {0, 0};

	        // ������������
	        Node[] tmp = new Node[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            tmp[i] = new Node(nums[i], i);
	        }

	        // �Ը��������������
	        Arrays.sort(tmp);

	        // ��¼�������������һ��ֵ���±�
	        int lo = 0;
	        // ��¼�����������ұ�һ��ֵ���±�
	        int hi = nums.length - 1;

	        // ���������м俿¤�������
	        while (lo < hi) {
	            // ����ҵ���������÷��ؽ���������˳�ѭ��
	            if (tmp[lo].val + tmp[hi].val == target) {

	                if (tmp[lo].idx > tmp[hi].idx) {
	                    result[0] = tmp[hi].idx + 1;
	                    result[1] = tmp[lo].idx + 1;
	                } else {
	                    result[0] = tmp[lo].idx + 1;
	                    result[1] = tmp[hi].idx + 1;
	                }
	                break;
	            }
	            // �������Ŀ��ֵ���ұߵ��±������ƶ�
	            else if (tmp[lo].val + tmp[hi].val > target) {
	                hi--;
	            }
	            // ���С��Ŀ��ֵ����ߵ��±������ƶ�
	            else {
	                lo++;
	            }
	        }
	        return result;
	    }
}
