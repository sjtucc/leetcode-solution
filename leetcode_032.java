package cn.cc.org;

import java.util.Stack;

public class leetcode_32 {
	 public int longestValidParentheses(String s) {
	        // ���ڼ�¼��ƥ��������ź������ŵ�λ��
	        Stack<Integer> st = new Stack<>();
	        int max = 0;
	        for (int i = 0; i < s.length(); i++) {

	            // ���ǵ�ǰ�ַ��������ţ����Ҽ�¼ջ�ǿգ�����ǰһ���ַ���������
	            if (s.charAt(i) == ')' && !st.isEmpty() && s.charAt(st.peek()) == '(') {
	                // �����ų�ջ
	                st.pop();
	                // �����ֵ
	                max = Math.max(max, i - ((st.isEmpty()) ? -1 : st.peek()));
	            }
	            // ��������ͽ��ַ���ջ
	            else {
	                st.push(i);
	            }
	        }
	        return max;
	    }
}
