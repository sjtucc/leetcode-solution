package cn.cc.org;

public class leetcode_50 {
	 public double myPow(double x, int n) {
	        if (x == 0 && n == 0) {
	            throw new IllegalArgumentException();
	        }

	        // ָ���������
	        boolean isNegative = false;

	        // ��n�ľ���ֵ
	        if (n < 0) {
	            n = -n;
	            isNegative = true;
	        }

	        double result = pow(x, n);

	        if (isNegative) {
	            return 1.0 / result;
	        } else {
	            return result;
	        }
	    }

	    public double pow(double x, int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            double result = pow(x, n / 2);
	            // n������
	            if (n % 2 != 0) {
	                return x * result * result;
	            } else {
	                return result * result;
	            }
	        }
	    }
}
