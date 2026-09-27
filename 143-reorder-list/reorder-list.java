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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secound=slow.next;
        slow.next=null;
        
        
        ListNode first=head;

        secound=reverse(secound);

        while(first!=null&&secound!=null){
            ListNode firstnext=first.next;
            ListNode secoundnext=secound.next;
            first.next=secound;
            secound.next=firstnext;
            first=firstnext;
            secound=secoundnext;

        }
        
    }
        private static ListNode reverse(ListNode secound){
            ListNode prev=null;
            ListNode curr=secound;
            while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            }
            return prev;
           
        }
        
        
        
    }
