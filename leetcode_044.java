package cn.cc.org;

public class leetcode_44 {
    public boolean isMatch(String s, String p) {
        char[] chars = s.toCharArray();
        char[] charp = p.toCharArray();

        int ss = -1,pp = -1;
        int sIndex = 0,pIndex = 0;

        while(sIndex<chars.length){
            if(pIndex == charp.length){//false£¬»ØËÝ
                if(pp == -1) return false;

                pIndex = pp+1; sIndex = ss++;
            }
            else if(charp[pIndex] == '?' || chars[sIndex] == charp[pIndex]){//ÏàÍ¬
                pIndex++;sIndex++;
            }else if(charp[pIndex] == '*'){
                pp = pIndex;ss = sIndex;pIndex = pp+1;
            }else{
                if(pp == -1) return false;
                pIndex = pp+1;sIndex = ss++;
            }
        }
        while(pIndex<charp.length){
            if(charp[pIndex] != '*')
                break;
            pIndex++;
        }
        return pIndex == charp.length; 
    }
}
