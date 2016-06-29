package cn.cc.org;

import java.util.HashMap;
import java.util.Stack;

public class leetcode_20 {
	public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();

//其实map是没必要的，两个字符串就行
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            if(map.keySet().contains(s.charAt(i)))
                stack.push(s.charAt(i));
            else if(map.values().contains(s.charAt(i)) &&(!stack.isEmpty())) {
                if(map.get(stack.peek()) != s.charAt(i))
                    return false;

                    stack.pop();
            } 
            else
                return false;

        }
        if(!stack.isEmpty())  //return stack.isEmpty()
            return false;
        return true;

    }
}
