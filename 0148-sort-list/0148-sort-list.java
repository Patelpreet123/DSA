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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode m=mid(head);
        ListNode r=m.next;
        m.next=null;
        ListNode l1=sortList(head);
        ListNode r1=sortList(r);
        return merge(l1,r1);
    }
    ListNode mid(ListNode head){
        ListNode s=head,f=head.next;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    ListNode merge(ListNode l,ListNode r){
        ListNode x=new ListNode(-1);
        ListNode t=x;
        while(l!=null&&r!=null){
            if(l.val<=r.val){
                t.next=l;
                t=t.next;
                l=l.next;
            }
            else{
                t.next=r;
                t=t.next;
                r=r.next;
            }
        }
        if(l!=null){
            t.next=l;
        }
        else{
            t.next=r;
        }
        return x.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna