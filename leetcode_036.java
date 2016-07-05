package cn.cc.org;

import java.util.HashMap;
import java.util.Map;

public class leetcode_36 {
	 //置为静态变量
    static Map map = new HashMap();
	public boolean isValidSudoku(char[][] board) {
        //判断每行
        for(int i = 0; i < board.length; i++){
            initMap();//每次均需初始化
            for(int j = 0; j < board[0].length; j++){
                //是数字
                if(board[i][j] >= '0' && board[i][j] <= '9'){
                    if((int)(map.get(board[i][j])) > 0){//说明重复数字
                        return false;
                    }else{
                        map.put(board[i][j],1);
                    }
                }else if(board[i][j] != '.'){//出现空格和0-9之外的字符
                    return false;//直接返回false
                }
            }
        }
        //判断每列
        for(int i = 0; i < board[0].length; i++){
            initMap();//每次均需初始化
            for(int j = 0; j < board.length; j++){
                //是数字
                if(board[j][i] >= '0' && board[j][i] <= '9'){
                	if((int)(map.get(board[i][j])) > 0){//说明重复数字
                        return false;
                    }else{
                        map.put(board[j][i],1);
                    }
                }else if(board[j][i] != '.'){//出现空格和0-9之外的字符
                    return false;//直接返回false
                }
            }
        }
        //判断九宫格
        for(int i = 0; i < board.length - 2; i = i+3){//行{
            for(int j = 0; j < board[0].length - 2; j=j+3){
                initMap();//初始化
                for(int m = i; m < i + 3;m++){
                    for(int n = j; n < j+3; n++){
                        //是数字
                        if(board[m][n] >= '0' && board[m][n] <= '9'){
                        	if((int)(map.get(board[i][j])) > 0){//说明重复数字
                                return false;
                            }else{
                                map.put(board[m][n],1);
                            }
                        }else if(board[m][n] != '.'){//出现空格和0-9之外的字符
                            return false;//直接返回false
                        }
                    }
                }
            }
        }
        return true;
    }
    //初始化map为每个key均赋值0
    private void initMap(){
        for(char i = '0';i <= '9'; i++){
            map.put(i,0);
        }
    }
}
