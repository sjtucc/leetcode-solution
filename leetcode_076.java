package cn.cc.org;

import java.util.HashMap;
import java.util.Map;

/*
 * ²Î¿¼http://www.cnblogs.com/remlostime/archive/2012/11/16/2774077.html
 */
public class leetcode_076 {
	 public String minWindow(String s, String t) {  
	        if (s == null || s.length() == 0 || t == null || t.length() == 0) {  
	            return "";  
	        }  
	        String res = "";  
	        Map<Character, Integer> map = new HashMap<>();  
	        for (int i = 0; i < t.length(); i++) {  
	            char c = t.charAt(i);  
	            if (map.containsKey(c)) {  
	                map.put(c, map.get(c) + 1);  
	            } else {  
	                map.put(c, 1);  
	            }  
	        }  
	        int prev = 0, count = 0, min = s.length() + 1;  
	        for (int i = 0; i < s.length(); i++) {  
	            if (map.containsKey(s.charAt(i))) {  
	                char c = s.charAt(i);  
	                map.put(c, map.get(c) - 1);  
	                if (map.get(c) >= 0) {  
	                    count++;  
	                }  
	                while (count == t.length()) {  
	                    char cha = s.charAt(prev);  
	                    if (map.containsKey(cha)) {  
	                        map.put(cha, map.get(cha) + 1);  
	                        if (map.get(cha) > 0) {  
	                            int len = i - prev + 1;  
	                            if (len < min) {  
	                                min = len;  
	                                res = s.substring(prev, i + 1);  
	                            }  
	                            count--;  
	                        }  
	                    }  
	                    prev++;  
	                }  
	            }  
	        }  
	          
	        return res;  
	    }  
}
