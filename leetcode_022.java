package cn.cc.org;

import java.util.ArrayList;
import java.util.List;

public class leetcode_22 {
	public List<String> generateParenthesis(int n) {
        // �������Ķ���
        List<String> result = new ArrayList<>();
        // ����������0
        if (n > 0) {
            // ʹ������
            char[] parentheses = new char[2 * n];
            // �������
            solve(n, n, parentheses, result);
        }
        return result;
    }

    /**
     * @param left        ʣ����õ���������
     * @param right       ʣ����õ���������
     * @param parentheses ����һ��Ϊֹ����ʹ�õ����
     * @param result      ��Ž���ļ���
     */
    public void solve(int left, int right, char[] parentheses, List<String> result) {

        // ʣ�µ�����������С��0������ÿ��ʣ�µ���������������С����������
        if (left < 0 || right < 0 || right < left) {
            // ʲô��������
        }
        // �������Ŷ���ʹ������
        else if (left == 0 && right == 0) {
            result.add(new String(parentheses));
        }
        // ����ʹ��
        else {
            // ��ǰʹ�õ�λ��
            int idx = parentheses.length - left - right;
            // ʹ��������
            parentheses[idx] = '(';
            // �ݹ����
            solve(left - 1, right, parentheses, result);
            // ʹ��������
            parentheses[idx] = ')';
            solve(left, right - 1, parentheses, result);
        }
    }
}
