package cn.cc.org;

class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
	}
	
}

public class leetcode_002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode root = new ListNode(0); // 头结点
        ListNode r = root;
        root.next = l1;

        int carry = 0; // 初始进位
        int sum;
        while (p1 != null && p2 != null) {
            sum = p1.val + p2.val + carry;
            p1.val = sum % 10; // 本位的结果
            carry = sum / 10; // 本次进位

            r.next = p1;
            r = p1; // 指向最后一个相加的结点
            p1 = p1.next;
            p2 = p2.next;

        }

        if (p1 == null) {
            r.next = p2;
        } else {
            r.next = p1;
        }

        // 最后一次相加还有进位
        if (carry == 1) {
            // 开始时r.next是第一个要相加的结点
            while (r.next != null) {
                sum = r.next.val + carry;
                r.next.val = sum % 10;
                carry = sum / 10;
                r = r.next;
            }

            // 都加完了还有进位，就要创建一个新的结点
            if (carry == 1) {
                r.next = new ListNode(1);
            }
        }

        return root.next;
    }
}

