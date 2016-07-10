package cn.cc.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 参考http://blog.csdn.net/doc_sgl/article/details/12314555
 */
public class leetcode_49 {
	public List<String> anagrams(String[] strs) {  
        List<String> list=new ArrayList<String>();  
        int len=strs.length;  
        if(len<=1)return list;  
        Map<String,Integer> map=new HashMap<String,Integer>();  
        String str=null;  
        for(int i=0;i<len;i++)  
        {  
           str=strs[i];  
            char[] chars=str.toCharArray();  
            Arrays.sort(chars);  
            str=new String(chars);  
            if(map.containsKey(str))//判断map中是否有重排列的str  
            {  
                int index=map.get(str);  
                if(index!=-1)//判断是否是第二次存在相同的key。如果是，将第一次的index所对应的数组值取出加入list  
                {  
                    list.add(strs[index]);  
                    map.put(str,-1);  
                }  
                list.add(strs[i]);  
            }else  
            {  
                map.put(str,i);  
            }  
        }  
     return list;         
    }  
}
