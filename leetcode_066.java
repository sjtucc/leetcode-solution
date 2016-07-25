package cn.cc.org;

public class leetcode_066 {
	public int[] plusOne(int[] digits) {

        int carry = 1; // ��λ��־����һλ���Ľ�λ��־
        int tmp;
        for (int i = digits.length - 1; i >= 0; i--) {
            tmp = digits[i];
            digits[i] = (tmp + carry) % 10; // ���㵱ǰλ����ֵ
            carry = (tmp + carry) / 10; // �����µĽ�λ

            if (carry == 0) { // û�н�λ�˾Ϳ����˳���
                break;
            }
        }

        if (carry == 1) { // �����һ����λ
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;;
            return result;
        } else {
            return digits;
        }
    }
}
