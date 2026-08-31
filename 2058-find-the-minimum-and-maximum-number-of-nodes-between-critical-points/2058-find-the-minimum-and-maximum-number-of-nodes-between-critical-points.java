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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int prev=-1;
        int first=-1;
        int i=1;
        ListNode t=head;
        while(t.next.next!=null){
            int a=t.val;
            int b=t.next.val;
            int c=t.next.next.val;
            if((b>a&&b>c)||(b<a&&b<c)){
                if(prev==-1){
                    prev=i;
                    first=i;
                }
                else{
                    min=Math.min(min,i-prev);
                    max=Math.max(max,i-first);
                    prev=i;
                }
            }
            t=t.next;
            i++;
        }
        if(min==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{min,max};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna