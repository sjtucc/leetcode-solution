package cn.cc.org;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }
}

public class leetcode_21 {
	public ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
		ListNode2 head = new ListNode2(0); // ����һ��ͷ��㣬���Ҫɾ����
	    ListNode2 tail = head;
	
	    while (l1 != null && l2 != null) {
	        if (l1.val <= l2.val) {
	            tail.next = l1;
	            l1 = l1.next;
	        } else {
	            tail.next = l2;
	            l2 = l2.next;
	        }
	
	        tail = tail.next; // �ƶ����µ�β���
	    }
	
	    tail.next = (l1 != null ? l1 : l2);
	
	    return head.next; // head����һ���ڵ��ǵ�һ�����ݽ��
	}
}
