package com.solution.leetcode;


public class LeetCode19 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LeetCode19 leetCode19 = new LeetCode19();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        leetCode19.removeNthFromEnd(root, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        //fast =3 4 5
        //slow=012345
        //fist
        //fast 4
        //slow 1
        //fast 5
        //slow 2
        //fast null
        //slow 3
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //345
        slow.next = slow.next.next;
        //35
        //start=01235 because start and slow reference is same
        return start.next;
    }

}
