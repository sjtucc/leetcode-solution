package cn.cc.org;

public class leetcode_058 {
	public int lengthOfLastWord(String s) {
        int num=0;
        int remember=0;//用来记住空格前面的那个字符，防止空格出现在最后
        if(s.length()==0)
                {
                    return 0;
                }
        else if (s.trim().isEmpty()) {
            return 0;//判断整个字符串是否全部为空格组成
        }
        else {
        for(int i=0;i<s.length();i++){
            num++;//用来计数，每次遇到空格则重新计数
            if(num!=1)
            {
         remember=num;}
        if(s.substring(i,i+1).equals(" ")){
        num=0;//遇到空格置零即可
        }
            }
        if(num==0){
            return (remember-1);
        }
        else{return num;}
        }
    }
}
