package cn.cc.org;

import java.math.BigInteger;

/*
 * ��Ҫ�Ǵ������㣬�����
 */
public class leetcode_43 {
	public String multiply(String num1, String num2) {  
        BigInteger n1 = new BigInteger(num1);  
        BigInteger n2 = new BigInteger(num2);  
       
        return n1.multiply(n2).toString();  
    }  
}
