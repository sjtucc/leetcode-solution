package cn.cc.org;
/*
 * ͳ��012�ֱ�ĸ�������������
 */
public class leetcode_075 {
	public void sortColors(int[] A) {  
        int count0 = 0;  
        int count1 = 0;  
        int count2 = 0;  
        for(int i = 0; i < A.length; i++){  
            if(A[i] == 0){  
                count0++;  
            }  
            if(A[i] == 1){  
                count1++;  
            }  
            if(A[i] == 2){  
                count2++;  
            }  
        }  
        for(int i = 0; i < count0; i++){  
            A[i] = 0;  
        }  
        for(int i = count0; i < count0+count1; i++){  
            A[i] = 1;  
        }  
        for(int i = count0+count1; i < count0+count1+count2; i++){  
            A[i] = 2;  
        }  
    }  
}
