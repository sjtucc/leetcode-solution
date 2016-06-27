package cn.cc.org;

public class leetcode_9 {
	 public boolean isPalindrome(int x) {

	        // �������ǻ�������
	        if (x < 0) {
	            return false;
	        }

	        // ������ת���ֵ��Ϊ�˲�ʹ���������long
	        long reverse = 0;
	        int tmp = x;

	        // ����ת���ֵ
	        while (tmp != 0) {
	            reverse = reverse * 10 + tmp % 10;
	            tmp /= 10;
	        }

	        // �ж��Ƿ��ǻ�������
	        return x == reverse;
	    }
}
