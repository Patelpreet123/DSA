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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode h=new ListNode(-10001);
        for(int i=0;i<lists.length;i++){
            h=merge(h,lists[i]);
        }
        return h.next;
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode h=new ListNode(-1);
        ListNode t=h;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                t.next=l1;
                l1=l1.next;
            }
            else{
                t.next=l2;
                l2=l2.next;
            }
            t=t.next;
        }
        if(l1!=null){
            t.next=l1;
        }
        else{
            t.next=l2;
        }
        return h.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna