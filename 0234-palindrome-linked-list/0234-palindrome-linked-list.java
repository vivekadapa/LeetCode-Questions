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
    
    public ListNode reverseSubList(ListNode head){
        ListNode temp = head;
        ListNode front = head;
        ListNode prev = null;
        while(temp != null){
            front =  temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode second = reverseSubList(slow.next);
        ListNode first = head;
        while(second != null){
            if(second.val != first.val){
                return false;
            }
            second = second.next;
            first = first.next;
        }
        
        return true;
    }
}