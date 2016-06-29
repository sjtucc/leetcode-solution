package cn.cc.org;

public class leetcode_28 {
	public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0)
            return 0;
        if(haystack.equals(needle))  
            return 0;
        int len = needle.length();
        int index = -1;
        for(int i=0; i<haystack.length()-len+1; i++) {
            if(haystack.substring(i, i+len).equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
