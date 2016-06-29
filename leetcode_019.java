package cn.cc.org;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}
public class leetcode_19 {
	public int listlen(ListNode1 head) {
        ListNode1 p = head;
        int len = 1;
        while(p.next != null) {
            len++;
            p = p.next;
        }
        return len;
   }
   public ListNode1 listDelete(ListNode1 head, int i, int len) {
       ListNode1 p = head;
       ListNode1 q = p.next;
       int j = 0;

       if(len == 1) {  //如果只有一个节点
           return null;
       } 
       if(i == j) {  //如果删除的是头节点
           return q;
       }


       while(q != null) {
           j++;
           if(j == i) {
               p.next = q.next;
           }
           p = q;
           q = q.next;
       }
       return head;

   }
   public ListNode1 removeNthFromEnd(ListNode1 head, int n) {
       int len = listlen(head);
       return listDelete(head, len-n, len);

   }
}
