package cn.cc.org;

import java.math.BigInteger;

/*
 * 主要是大数计算，防溢出
 */
public class leetcode_43 {
	public String multiply(String num1, String num2) {  
        BigInteger n1 = new BigInteger(num1);  
        BigInteger n2 = new BigInteger(num2);  
       
        return n1.multiply(n2).toString();  
    }  
}
