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
    public ListNode middleNode(ListNode head) {
         if(head == null){
             return null;
         }
         if(head.next == null){
             return head;
         }
         ListNode temp = head;
         int count = 0;
         while(temp != null){
              temp = temp.next;
              count++;
         }
        ListNode temp1 = head;
             int n = count / 2;
             while(n > 0){
                 temp1 = temp1.next;
                 n--;
             }
             return temp1;     
    }
}