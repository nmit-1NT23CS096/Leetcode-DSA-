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
    public ListNode mergeNodes(ListNode head) {
        ListNode modify = head;
        ListNode current = head.next;
        int sum=0;

        while( current != null ){
            if(current.val !=0 ) sum += current.val;
            else{
                modify.val = sum;
                if(current.next == null ){
                    modify.next = null;
                    break;
                }
                modify.next = current;
                modify = current;
                sum=0;
            }
            current = current.next;
        }
        
        return head;
    }
    
}