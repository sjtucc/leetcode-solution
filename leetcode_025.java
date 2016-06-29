package cn.cc.org;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class leetcode_25 {
	 public ListNode reverseKGroup(ListNode head, int k) {
	        int len = lenListNode(head);  //����������

	        int times = len / k;   //��������

	        for(int i=0; i<times; i++) {   
	            reverse(head, i*k+1, i*k+k);//ÿ��reverse��ͷ��β
	        }

	        return head;

	    }

	    public int lenListNode(ListNode head) { //����������
	        int len = 0;
	        ListNode p = head;
	        while(p!=null) {
	            len++;
	            p = p.next;
	        }
	        return len;
	    }

	    public void reverse(ListNode head, int start, int end) {   //���ڷ�ת
	        ListNode p = head;
	        ListNode left = null;  //start��ָ��
	        ListNode right = null; //end��ָ��

	        int i = 1;
	        while(p!=null) {
	            if(i==start)   //�ҵ�start�Ǹ�node������leftָ����
	                left = p;
	            else if(i==end) { //�ҵ�end�Ǹ�node������rightָ����
	                right = p;
	                break;   //end���ҵ��ˣ�û��Ҫ�ٱ�����
	            }
	            i++;
	            p = p.next;
	        }
	        while(start<end) {

	            left.val = left.val ^ right.val;   //��תʵ��
	            right.val = left.val ^ right.val;
	            left.val = left.val ^ right.val;
	            start++;
	            end--;

	            ListNode q = head;  //����������node������ָ��ָ���������Ӧ�÷�װΪ����������������̫����
	            int j = 1;
	            while( q!=null) {
	                if(j==start) 
	                    left = q;
	                else if(j==end) {
	                    right = q;
	                    break;
	                }
	                j++;
	                q = q.next;
	            }

	        }
	    }
}
