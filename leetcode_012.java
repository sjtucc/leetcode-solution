package cn.cc.org;

public class leetcode_12 {
	 public String intToRoman(int num) {

	        String[][] base = new String[][]{
	                {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // ��λ�ı�ʾ
	                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, // ʮλ�ı�ʾ
	                {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, // �ٱ��ı�ʾ
	                {"M", "MM", "MMM", "", "", "", "", "", ""}}; // ǧλ�ı�ʾ


	        String result = "";

	        // ÿ��һ�ξ�ʾ�����һ����λ����С����
	        // i��¼��ǰ������ǵڼ�����λ
	        for (int i = 0; num != 0; num /= 10, i++) {
	            // �����Ϊ0��˵�������λ����ֵ��Ҫ������Ӳ���
	            if (num % 10 != 0) {
	                // ƴ�ӽ��
	                result = base[i][num % 10 - 1] + result;
	            }
	        }

	        return result;
	    }
}
