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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null||head.next==null){
            return head;
        }
        int length=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        ListNode tail=curr;
        
        k=k%length;
        if(k==0){
            return head;
        }
        curr=head;
        for(int i=1;i<length-k;i++){
            curr=curr.next;
        }
        ListNode newnode=curr.next;
        
        tail.next=head;
        curr.next=null;
        return newnode;
        
        
    }
}