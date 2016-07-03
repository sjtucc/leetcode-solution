package cn.cc.org;

public class leetcode_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];   
        if(nums==null || nums.length==0)
            return nums;
        if(nums[0] == target) {   //�����һ�����͵���target
            int i = 0;
            while((i+1)<=nums.length-1 && nums[i+1] == target) {
                i++;
            }
            result[0] = 0;
            result[1] = i;
            return result;
        }
        int index = 0;  //����target���Ǹ���������
        int left = 0;   //���ַ��������ֵ
        int right = nums.length-1;//���ַ������ұ�ֵ

        while(left < right) {   //whileѭ��Ϊ���ַ����ң�
                                //��ȻArrays�����ṩ�˶��ֲ��ҷ��������Լ����ԡ�
             if(nums[(left+right)/2] == target) {
                 index = (left+right)/2;
                 break;
             }
             else if(nums[(left+right)/2] < target) {
                 left = (left+right)/2;
                 /*if((right-left)==1 && nums[right]!=target && nums[left]!=target)
                     break;*/
                 if((right-left)==1) {     //��if����ǽ�����ֲ���������������ѭ������
                     if(nums[right]!=target && nums[left]!=target)
                         break;
                     else if(nums[right]==target) {
                         index = right;
                         break;
                     }
                     else if(nums[left]==target) {
                         index = left;
                         break;
                     }
                 }
             }
             else if(nums[(left+right)/2] > target) {
                 right = (left+right)/2;
                 if((right-left)==1) {     //��if����ǽ�����ֲ���������������ѭ������
                     if(nums[right]!=target && nums[left]!=target)
                         break;
                     else if(nums[right]==target) {
                         index = right;
                         break;
                     }
                     else if(nums[left]==target) {
                         index = left;
                         break;
                     }
                 }
             }
        }
        if(index == 0) {    //û����target��ȵ���
            result[0] = -1;
            result[1] = -1;


        } else {    //����target��ȵ���
            //����������������ظ��������ֲ��ҵ�����׼ȷ�ҵ���һ������target������������Ҫ��������
            int i = index;
            int j = index;
            while((i-1)>=0 && nums[i-1] == target) { 
                i--;
            }
            while((j+1)<=nums.length-1 && nums[j+1] == target) {
                j++;
            }
            result[0] = i;
            result[1] = j;


        }
        return result;    
    }
}
