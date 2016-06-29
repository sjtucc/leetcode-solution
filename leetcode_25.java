package cn.cc.org;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class leetcode_25 {
	 public ListNode reverseKGroup(ListNode head, int k) {
	        int len = lenListNode(head);  //计算链表长度

	        int times = len / k;   //计算组数

	        for(int i=0; i<times; i++) {   
	            reverse(head, i*k+1, i*k+k);//每组reverse的头和尾
	        }

	        return head;

	    }

	    public int lenListNode(ListNode head) { //计算链表长度
	        int len = 0;
	        ListNode p = head;
	        while(p!=null) {
	            len++;
	            p = p.next;
	        }
	        return len;
	    }

	    public void reverse(ListNode head, int start, int end) {   //组内翻转
	        ListNode p = head;
	        ListNode left = null;  //start的指针
	        ListNode right = null; //end的指针

	        int i = 1;
	        while(p!=null) {
	            if(i==start)   //找到start那个node，并用left指向它
	                left = p;
	            else if(i==end) { //找到end那个node，并用right指向它
	                right = p;
	                break;   //end都找到了，没必要再遍历了
	            }
	            i++;
	            p = p.next;
	        }
	        while(start<end) {

	            left.val = left.val ^ right.val;   //翻转实现
	            right.val = left.val ^ right.val;
	            left.val = left.val ^ right.val;
	            start++;
	            end--;

	            ListNode q = head;  //根据索引找node，并用指针指向它，这个应该封装为方法，这样看起来太繁琐
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
