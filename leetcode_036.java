package cn.cc.org;

import java.util.HashMap;
import java.util.Map;

public class leetcode_36 {
	 //��Ϊ��̬����
    static Map map = new HashMap();
	public boolean isValidSudoku(char[][] board) {
        //�ж�ÿ��
        for(int i = 0; i < board.length; i++){
            initMap();//ÿ�ξ����ʼ��
            for(int j = 0; j < board[0].length; j++){
                //������
                if(board[i][j] >= '0' && board[i][j] <= '9'){
                    if((int)(map.get(board[i][j])) > 0){//˵���ظ�����
                        return false;
                    }else{
                        map.put(board[i][j],1);
                    }
                }else if(board[i][j] != '.'){//���ֿո��0-9֮����ַ�
                    return false;//ֱ�ӷ���false
                }
            }
        }
        //�ж�ÿ��
        for(int i = 0; i < board[0].length; i++){
            initMap();//ÿ�ξ����ʼ��
            for(int j = 0; j < board.length; j++){
                //������
                if(board[j][i] >= '0' && board[j][i] <= '9'){
                	if((int)(map.get(board[i][j])) > 0){//˵���ظ�����
                        return false;
                    }else{
                        map.put(board[j][i],1);
                    }
                }else if(board[j][i] != '.'){//���ֿո��0-9֮����ַ�
                    return false;//ֱ�ӷ���false
                }
            }
        }
        //�жϾŹ���
        for(int i = 0; i < board.length - 2; i = i+3){//��{
            for(int j = 0; j < board[0].length - 2; j=j+3){
                initMap();//��ʼ��
                for(int m = i; m < i + 3;m++){
                    for(int n = j; n < j+3; n++){
                        //������
                        if(board[m][n] >= '0' && board[m][n] <= '9'){
                        	if((int)(map.get(board[i][j])) > 0){//˵���ظ�����
                                return false;
                            }else{
                                map.put(board[m][n],1);
                            }
                        }else if(board[m][n] != '.'){//���ֿո��0-9֮����ַ�
                            return false;//ֱ�ӷ���false
                        }
                    }
                }
            }
        }
        return true;
    }
    //��ʼ��mapΪÿ��key����ֵ0
    private void initMap(){
        for(char i = '0';i <= '9'; i++){
            map.put(i,0);
        }
    }
}
