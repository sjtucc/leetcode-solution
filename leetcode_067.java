package cn.cc.org;

public class leetcode_067 {
	public String addBinary(String a, String b) {

        int[] ca = new int[a.length()];
        int[] cb = new int[b.length()];

        // 将字符数组中的值转换了数值的0或者1
        for (int i = 0; i < a.length(); i++) {
            ca[i] = a.charAt(i) - '0';
        }

        // 将字符数组中的值转换了数值的0或者1
        for (int i = 0; i < b.length(); i++) {
            cb[i] = b.charAt(i) - '0';
        }

        // 使用ca保存的长度长
        if (ca.length < cb.length) {
            int[] tmp = ca;
            ca = cb;
            cb = tmp;
        }


        int ai = ca.length - 1; // 字符数组ca最后一个索引下标
        int bi = cb.length - 1; // 字符数组cb最后一个索引下标
        int carry = 0; // 下位的进位标识
        int result; // 加载的结果

        // 计算比如：1010101101 + 10100
        while (ai >= 0 && bi >= 0) {
            result = ca[ai] + cb[bi] + carry;
            ca[ai] = result % 2;
            carry = result / 2;

            ai--;
            bi--;
        }

        // 处理余下的数字
        while (ai >= 0) {
            result = ca[ai] + carry;
            ca[ai] = result % 2;
            carry = result / 2;

            if (carry == 0) {
                break;
            }

            ai--;
        }

        // 将字符数组中的值转换了字符的0或者1
        for (int i = 0; i < ca.length; i++) {
            ca[i] += '0';
        }

        // 不需要扩展一位
        if (carry == 0) {

            char[] ch = new char[ca.length];
            for (int i = 0; i < ca.length; i++) {
                ch[i] = (char) (ca[i]);
            }

            return new String(ch);
        } 
        // 需要扩展一位
        else {
            char[] ch = new char[ca.length + 1];
            ch[0] = '1';
            for (int i = 0; i < ca.length; i++) {
                ch[i + 1] = (char) (ca[i]);
            }
            return new String(ch);
        }
    }
}
