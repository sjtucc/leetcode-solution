package cn.cc.org;

public class leetcode_31 {
	public void nextPermutation(int[] num) {  
        //1.�ҵ����һ������λ��pos  
        int pos = -1;  
        for (int i = num.length - 1; i > 0; i--) {  
            if (num[i] > num[i - 1]) {  
                pos = i - 1;  
                break;  
            }  
        }  
          
        //2.������������򣬼�����������ģ���ô�����������  
        if (pos < 0) {  
            reverse(num, 0, num.length - 1);  
            return;  
        }  
          
        //3.����������ô�ҵ�pos֮�����һ���������λ��  
        for (int i = num.length - 1; i > pos; i--) {  
            if (num[i] > num[pos]) {  
                int tmp = num[i];  
                num[i] = num[pos];  
                num[pos] = tmp;  
                break;  
            }  
        }  
          
        //4.����pos֮�����  
        reverse(num, pos + 1, num.length - 1);  
    }  
      
    public void reverse(int[] num, int begin, int end) {  
        int l = begin, r = end;  
        while (l < r) {  
            int tmp = num[l];  
            num[l] = num[r];  
            num[r] = tmp;  
            l++;  
            r--;  
        }  
    }  
}
