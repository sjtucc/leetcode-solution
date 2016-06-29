package cn.cc.org;

import java.util.ArrayList;
import java.util.List;

public class leetcode_30 {
	/*
     * s: "barfoothefoobarman"
     * words: ["foo", "bar"]
     */
    public List<Integer> findSubstring(String s, String[] words) {
        int len = words[0].length() * words.length;  //6
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<s.length()-len; i++) {  //s中6个位一组，遍历
            StringBuffer sb = new StringBuffer(s.substring(i, i+len));  //取6个长度的字符串

            for(int j=0; j<words.length; j++) {
                int index = sb.indexOf(words[j]);   //看6个长度字符串是否包含foo或bar
                if(index == -1) {
                    break;
                } else {
                    sb.delete(index, index+words[0].length());  //包含了删除
                }
            }
            if(sb.length() == 0)  //删光了，说明不管重复与否，6个长度字符串肯定包含了["foo", "bar"]
                result.add(i);

        }
        return result;
    }
}
