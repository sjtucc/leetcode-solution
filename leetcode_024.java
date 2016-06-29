package cn.cc.org;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class leetcode_24 {
	public ListNode swapPairs(ListNode head) {
        if(head==null) {
            return head;
        }
        ListNode p = head;
        int i = 0;
        while(p.next!=null) {

            if(i%2==0) {
                p.val = p.val ^ p.next.val;
                p.next.val = p.val ^ p.next.val;
                p.val = p.val ^ p.next.val;
            }
            i++;
            p = p.next;
        }
        return head;
    }
}
