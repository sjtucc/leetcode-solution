package cn.cc.org;

public class leetcode_058 {
	public int lengthOfLastWord(String s) {
        int num=0;
        int remember=0;//������ס�ո�ǰ����Ǹ��ַ�����ֹ�ո���������
        if(s.length()==0)
                {
                    return 0;
                }
        else if (s.trim().isEmpty()) {
            return 0;//�ж������ַ����Ƿ�ȫ��Ϊ�ո����
        }
        else {
        for(int i=0;i<s.length();i++){
            num++;//����������ÿ�������ո������¼���
            if(num!=1)
            {
         remember=num;}
        if(s.substring(i,i+1).equals(" ")){
        num=0;//�����ո����㼴��
        }
            }
        if(num==0){
            return (remember-1);
        }
        else{return num;}
        }
    }
}
