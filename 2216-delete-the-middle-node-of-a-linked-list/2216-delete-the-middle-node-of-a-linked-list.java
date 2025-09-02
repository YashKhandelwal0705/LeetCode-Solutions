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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==1) return null;
        int n=count/2;
        int p=0;
        ListNode temp2=head;
        while(temp2!=null){
            if(p==n-1){
                temp2.next=temp2.next.next;
            }
            temp2=temp2.next;
            p++;
        }
        return head;
    }
}