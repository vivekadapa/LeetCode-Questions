/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hSet = new HashSet<>();
        ListNode temp = head;
        int pos = 0;
        while(temp != null){
            if(hSet.contains(temp)){
                return temp;
            }
            hSet.add(temp);
            temp = temp.next;
            pos++;
        }
        
        return null;
        
    }
}