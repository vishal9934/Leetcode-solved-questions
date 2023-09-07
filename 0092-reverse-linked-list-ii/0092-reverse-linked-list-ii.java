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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;

        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        dummy.next=head;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode current=prev.next;
         ListNode next=null;
        ListNode temp=null;
        for(int i=0;i<right-left+1;i++){
             next=current.next;
             current.next=temp;
             temp=current;
             current=next;
        }
        prev.next.next=current;
        prev.next=temp;

        return dummy.next;
    }
}