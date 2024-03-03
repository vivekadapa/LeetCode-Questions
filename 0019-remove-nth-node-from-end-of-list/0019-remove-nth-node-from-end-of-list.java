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
         ListNode temp = head;
         int length = 0;    
         while(temp != null){
             temp = temp.next;
             length++;
         }
         int p = length - n;
         temp = head;
         if(p==0){
             temp = temp.next;
             return temp;
         }
         while(p-1 > 0){
            temp = temp.next;
            p--;
         }
         ListNode temp1 = temp.next.next;
         temp.next = temp1;
         
        return head;  
    }
}