/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        Stack<ListNode> stack = new Stack<>();
        ListNode pointer = head;
        int size = 0;
        while (pointer != null) {
            stack.add(pointer);
            pointer = pointer.next;
            size ++;
        }
        ListNode left = head, right = head.next;
        for (int i = 0; i < (size - 1)/2; i++) {
            left.next = stack.pop();
            left.next.next = right;
            left = right;
            right = left.next;
        }
        stack.pop().next = null;
    }
}
