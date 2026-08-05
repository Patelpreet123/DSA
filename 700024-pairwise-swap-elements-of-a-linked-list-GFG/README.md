# [Pairwise swap elements of a linked list](https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1)
## Easy
Given the head of a singly linked list, swap every two adjacent nodes and return the new head.
Note: Try to swap the nodes, not only the data. 
Examples:
Input: head = 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 Output: 2 -&gt; 1 -&gt; 4 -&gt; 3 -&gt; 5
Explanation: The list has 5 nodes, so we form pairs from the front: [1, 2], [3, 4], and 5 remains unpaired (odd node count).
Swapping each pair gives: [2, 1], [4, 3], and 5 stays as is.
Final list: 2 -&gt; 1 -&gt; 4 -&gt; 3 -&gt; 5.
Input: head = 8 -&gt; 7 -&gt; 5 -&gt; 2 -&gt; 1
Output: 7 -&gt; 8 -&gt; 2 -&gt; 5 -&gt; 1
Explanation: The list has 5 nodes, so we form pairs from the front: [8, 7], [5, 2], and 1 remains unpaired (odd node count).
Swapping each pair gives: [7, 8], [2, 5], and 1 stays as is.
Final list: 7 -&gt; 8 -&gt; 2 -&gt; 5 -&gt; 1.
Constraints:1 ≤ size of linked list ≤ 1061 ≤ elements of linked list ≤ 106