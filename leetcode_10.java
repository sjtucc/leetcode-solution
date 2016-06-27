package cn.cc.org;

import java.util.Arrays;

public class leetcode_10 {
	public boolean isMatch(String s, String p) {
        // ���������
        boolean[] match = new boolean[s.length() + 1];
        // ��ʼ��
        Arrays.fill(match, false);
        // �ٶ����Ľ����ƥ���
        match[s.length()] = true;

        // ��ģʽ���Ӻ���ǰ���д���
        for (int i = p.length() - 1; i >= 0; i--) {

            // �����ǰ��*
            if (p.charAt(i) == '*') {

                // ƥ�䴮�����һ����ʼ����
                for (int j = s.length() - 1; j >= 0; j--)  {
                    match[j] = match[j] || match[j + 1] && (p.charAt(i - 1) == '.' || s.charAt(j) == p.charAt(i - 1));
                }
                i--;
            }
            // �������*
            else {
                for (int j = 0; j < s.length(); j++) {
                    match[j] = match[j + 1] && (p.charAt(i) == '.' || p.charAt(i) == s.charAt(j));
                }

                match[s.length()] = false;
            }
        }
        return match[0];
    }
}
