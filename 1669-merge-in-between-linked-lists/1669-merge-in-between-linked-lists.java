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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         ListNode aprev = null;
         ListNode bnext = null;
         ListNode temp1 = list1;
         ListNode temp2 = list1;
         while(a-1>0){
            a--;
            temp1 = temp1.next;
         }
         while(b>0){
            b--;
            temp2 = temp2.next;
         }
         aprev = temp1;
         bnext = temp2;
         System.out.println(aprev.val);
         System.out.println(bnext.val);         
         

         ListNode temp = list2;
         while(temp.next != null){
            temp = temp.next;
         }
         aprev.next = list2;
         temp.next = bnext.next;
        
        return list1;
    }
}