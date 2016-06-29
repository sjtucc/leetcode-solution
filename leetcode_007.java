package cn.cc.org;

public class leetcode_7 {
	 public int reverse(int x) {
	        long tmp = x;
	        // ��ֹ������
	        long result = 0;

	        while (tmp != 0) {
	            result = result * 10 + tmp % 10;
	            tmp = tmp / 10;
	        }

	        // ����ж� 
	        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
	            result = 0;
	        }

	        return (int) result;
	    }
}
