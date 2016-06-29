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

        for(int i=0; i<s.length()-len; i++) {  //s��6��λһ�飬����
            StringBuffer sb = new StringBuffer(s.substring(i, i+len));  //ȡ6�����ȵ��ַ���

            for(int j=0; j<words.length; j++) {
                int index = sb.indexOf(words[j]);   //��6�������ַ����Ƿ����foo��bar
                if(index == -1) {
                    break;
                } else {
                    sb.delete(index, index+words[0].length());  //������ɾ��
                }
            }
            if(sb.length() == 0)  //ɾ���ˣ�˵�������ظ����6�������ַ����϶�������["foo", "bar"]
                result.add(i);

        }
        return result;
    }
}
