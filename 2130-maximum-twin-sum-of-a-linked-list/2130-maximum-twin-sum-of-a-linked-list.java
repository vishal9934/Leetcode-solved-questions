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
    public int pairSum(ListNode head) {
        
        ListNode slow =head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
       while(slow!=null){
           ListNode next=slow.next;
           slow.next=prev;
           prev=slow;
           slow=next;
       }
        int maxSum=0;
        ListNode left=head;
        while(prev!=null){
            maxSum=Math.max(maxSum,left.val+prev.val);
            left=left.next;
            prev=prev.next;
        }
        return maxSum;
    }
}