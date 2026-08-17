# [Delete in a Doubly Linked List](https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1)
## Easy
Given the head of a doubly linked list and an integer x, delete the node at the xth position (1-based indexing) and return the head of the modified list.
Examples:
Input: x = 3,Output: 1 &lt;-&gt; 3
Explanation: After deleting the node at position 3 (position starts from 1), the updated linked list is 1 &lt;-&gt; 3.
Input: x = 1,Output: 5 &lt;-&gt; 2 &lt;-&gt; 9Explanation: After deleting the node at position 1, the updated linked list is 5 &lt;-&gt; 2 &lt;-&gt; 9.
Constraints:1 ≤ x ≤ size of the linked list ≤ 1060 ≤ node-&gt;data ≤ 104