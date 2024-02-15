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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int data = l1.val + l2.val;
         int value = data % 10;
         int carry = data / 10;
         ListNode head = new ListNode(value);
         ListNode temp = head;
         ListNode temp1 = l1.next;
         ListNode temp2 = l2.next;
         while(temp1 != null || temp2 != null){
            if(temp1!= null && temp2 != null){
                int sum = temp1.val + temp2.val + carry;
                ListNode newNode = new ListNode(sum%10);
                carry = sum / 10;
                temp.next = newNode;
                temp = temp.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1 == null && temp2 != null){
                int sum = temp2.val + carry;
                ListNode newNode = new ListNode(sum%10);
                carry = sum / 10;
                temp.next = newNode;
                temp = temp.next;
                temp2 = temp2.next;
            }
            else{
                int sum = temp1.val + carry;
                ListNode newNode = new ListNode(sum%10);
                carry = sum / 10;
                temp.next = newNode;
                temp = temp.next;
                temp1 = temp1.next;
            }
         }
         
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }
        
        return head; 
    }
}