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
             int cnt = 0;
        ListNode head2 = head;

        while(head2!=null){
            cnt++;
            head2=head2.next;
        }

        if(cnt == 1) return null;


        head2=head;
        cnt = cnt-n;
        ListNode prev = null;
        if(cnt==0){
            head = head.next;
            return head;
        }
        while(head2!=null){
            cnt--;
            if(cnt==0){
                 head2.next=head2.next.next;
                 break;
            }
            
            
            head2=head2.next;
        }

        return head;
    }
}
