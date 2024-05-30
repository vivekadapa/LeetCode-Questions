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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode newList = new ListNode(0);
        ListNode temp = newList;
        while(list1 != null || list2 != null){
            if(list1 != null && list2 == null){
                ListNode newNode = new ListNode(list1.val);
                temp.next = newNode;
                temp = temp.next;
                list1= list1.next;
            }
            else if(list1 == null && list2 != null){
                ListNode newNode = new ListNode(list2.val);
                temp.next = newNode;
                temp = temp.next;
                list2 = list2.next;
            }
            else{
                if(list1.val >= list2.val){
                 ListNode newNode = new ListNode(list2.val);
                 temp.next = newNode;
                 temp = temp.next;
                 list2 = list2.next;  
                }
                else{
                ListNode newNode = new ListNode(list1.val);
                temp.next = newNode;
                temp = temp.next;
                list1= list1.next; 
                }
            }
            
        }
        return newList.next;
    }
}