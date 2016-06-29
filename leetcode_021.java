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
		ListNode2 head = new ListNode2(0); // 创建一个头结点，最后还要删除掉
	    ListNode2 tail = head;
	
	    while (l1 != null && l2 != null) {
	        if (l1.val <= l2.val) {
	            tail.next = l1;
	            l1 = l1.next;
	        } else {
	            tail.next = l2;
	            l2 = l2.next;
	        }
	
	        tail = tail.next; // 移动到新的尾结点
	    }
	
	    tail.next = (l1 != null ? l1 : l2);
	
	    return head.next; // head的下一个节点是第一个数据结点
	}
}
