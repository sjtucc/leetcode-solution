package cn.cc.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_17 {
	public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        map.put(0, "");

        ArrayList<String> result = new ArrayList<String>();
        ArrayList<Character> tmp = new ArrayList<Character>();

        if(digits == null || digits.length() == 0) 
            return result;

        getString(digits, tmp, result, map);

        return result;

    }
    private void getString(String digits, ArrayList<Character> tmp, ArrayList<String> result, HashMap<Integer, String> map) {
        if(digits.length() == 0) {    //递归到最后一个
            char[] arr = new char[tmp.size()];  //将list类型tmp中数据变为字符串
            for(int i=0; i<tmp.size(); i++){
                arr[i] = tmp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }

        Integer curr = Integer.valueOf(digits.substring(0,1));
        String s = (String)map.get(curr);
        for(int i=0; i<s.length(); i++) {

            tmp.add(s.charAt(i));
            getString(digits.substring(1), tmp, result, map);
            tmp.remove(tmp.size()-1);  //每次增加一个字符
        }
    }
}
