# [Add all Greater in BST](https://www.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1)
## Medium
Given root of a Binary Search Tree (BST), modify the tree such that every node stores the sum of its original value and all node values greater than it in the BST. Return the root of the modified BST.Examples:Input: root[] = [50, 30, 70, 20, 40, 60, 80] Output: [260, 330, 150, 350, 300, 210, 80]
Explanation: After modifying the BST, each node contains the sum of its original value and all values greater than it in the BST. The modified tree is:  The level-order traversal of the modified tree is:
[260, 330, 150, 350, 300, 210, 80]Input: root[] = [2, 1, 5, N, N, 4, 7]Output: [18, 19, 12, N, N, 16, 7]
Explanation: After modifying the BST, each node contains the sum of its original value and all values greater than it in the BST. The modified tree is:
The level-order traversal of the modified tree is:
[18, 19, 12, N, N, 16, 7]