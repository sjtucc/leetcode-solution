package cn.cc.org;

public class leetcode_014 {
	public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }

        if (strs.length == 0) {
            return "";
        }

        int min = Integer.MAX_VALUE;  // 记录最短的字符串的长度

        // 找短字符串的长度
        for (String str : strs) {

            if (str == null) {
                return null;
            }

            if (min > str.length()) {
                min = str.length();
            }
        }

        int i; // 记录最长前缀的字符数
        boolean flag;
        for (i = 0; i < min; i++) {
            flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }

//        if (i == 0) {
//            return null;
//        }

        return strs[0].substring(0, i);

    }
}
