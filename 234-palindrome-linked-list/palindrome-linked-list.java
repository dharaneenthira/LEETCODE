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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        ListNode reverse=reverseList(slow);
        ListNode first=head;
        ListNode secound=reverse;
        while(first!=null && secound!=null){
            if(first.val!=secound.val){
                return false;
            }
            first=first.next;
            secound=secound.next;
        }
        return true;
    }
        private ListNode reverseList(ListNode head){
            ListNode curr=head;
            ListNode prev=null;
            while(curr!=null){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
            
        }
        
        
        
    }
