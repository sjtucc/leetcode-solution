package cn.cc.org;

public class leetcode_065 {
    public boolean isNumber(String s) {
          if(s.trim().isEmpty()){  
              return false;  
          }  
          String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";  
          if(s.trim().matches(regex)){  
              return true;  
          }else{  
              return false;  
         }  
     }
}
