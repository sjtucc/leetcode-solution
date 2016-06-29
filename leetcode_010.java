package cn.cc.org;

import java.util.Arrays;

public class leetcode_10 {
	public boolean isMatch(String s, String p) {
        // 标记数数组
        boolean[] match = new boolean[s.length() + 1];
        // 初始化
        Arrays.fill(match, false);
        // 假定最后的结果是匹配的
        match[s.length()] = true;

        // 对模式串从后向前进行处理
        for (int i = p.length() - 1; i >= 0; i--) {

            // 如果当前是*
            if (p.charAt(i) == '*') {

                // 匹配串从最后一个开始处理
                for (int j = s.length() - 1; j >= 0; j--)  {
                    match[j] = match[j] || match[j + 1] && (p.charAt(i - 1) == '.' || s.charAt(j) == p.charAt(i - 1));
                }
                i--;
            }
            // 如果不是*
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
