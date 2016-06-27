package cn.cc.org;

import java.util.HashMap;
import java.util.Map;

public class leetcode_3 {
	public int lengthOfLongestSubstring(String s) {
        // �ַ������벻�Ϸ�
        if (s == null) {
            return 0;
        }

        // ��ǰ����Ŀ�ʼλ��
        int start = 0;
        // ��¼���������ظ��Ӵ�����
        int result = 0;
        // ���ʱ�ǣ���¼����һ�η��ʵ��ַ���λ��
        Map<Character, Integer> map = new HashMap<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // ����ַ��Ѿ����ֹ�(�ڱ�ǿ�λ������)�������±��start
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            // ���û�г��ֹ��������ķ��ظ��Ӵ��ĳ���
            else {
                result = Math.max(result, i - start + 1);
            }

            // ���·��ʼ�¼
            map.put(ch, i);
        }
        return result;
    }
}
