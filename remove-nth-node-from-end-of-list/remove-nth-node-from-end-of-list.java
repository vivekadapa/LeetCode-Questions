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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0,head);
        ListNode ptr = ans;
        ListNode temp = head;
        while(n > 0){
            temp = temp.next;
            n--;
        }
        
        while(temp != null){
            temp = temp.next;
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        
        return ans.next;
    }
}