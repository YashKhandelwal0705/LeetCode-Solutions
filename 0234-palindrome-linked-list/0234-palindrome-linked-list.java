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
    public boolean isPalindrome(ListNode head) {
        ListNode l1=head;
        ListNode l2=head;
        while(l2!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next.next;
        }

        l1=reverse(l1);

        ListNode left=head;
        ListNode right=l1;

        while(right!=null){
            if(left.val!=right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }

    private ListNode reverse(ListNode l1){
        ListNode prev=null;
        while(l1!=null){
            ListNode nextNode = l1.next;
            l1.next=prev;
            prev=l1;
            l1=nextNode;
        }
        return prev;
    }
}