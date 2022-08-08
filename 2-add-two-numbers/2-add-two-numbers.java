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
        
        
        ListNode dummy= new ListNode();
        ListNode l3 = dummy;
        
        int carry = 0;
        
        while(l1!=null || l2!= null) {
            
            int sum = (l1 == null? 0: l1.val) + (l2 == null? 0: l2.val) + carry ;
            
            l1 = (l1!=null)?l1.next :l1;
            l2 = (l2!=null)?l2.next : l2;
            carry = sum /10;
            sum = sum %10;
            
            
            l3.next = new ListNode(sum);
            
            l3 = l3.next;
        }
        if(carry != 0) l3.next = new ListNode(carry);
        
        ListNode solution = dummy.next;
        return solution;
    }
}