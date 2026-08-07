# [Subarrays With At Most K Distinct](https://www.geeksforgeeks.org/problems/subarrays-with-at-most-k-distinct-integers/1)
## Medium
You are given an array&nbsp;arr[]&nbsp;of positive integers and an integer&nbsp;k, find the number of&nbsp;subarrays&nbsp;in&nbsp;arr[]&nbsp;where the count of distinct integers is at most k.
Note:&nbsp;A&nbsp;subarray&nbsp;is a&nbsp;contiguous&nbsp;part of an array.
Examples:
Input: arr[] = [1, 2, 2, 3], k = 2Output: 9Explanation: Subarrays with at most 2 distinct elements are: [1], [2], [2], [3], [1, 2], [2, 2], [2, 3], [1, 2, 2] and [2, 2, 3].
Input: arr[] = [1, 1, 1], k = 1Output: 6Explanation: Subarrays with at most 1 distinct element are: [1], [1], [1], [1, 1], [1, 1] and [1, 1, 1].
Input: arr[] = [1, 2, 1, 1, 3, 3, 4, 2, 1], k = 2Output: 24Explanation: There are 24 subarrays with at most 2 distinct elements.
Constraints:1 ≤ arr.size() ≤ 2*1041 ≤ k ≤ 2*1041 ≤ arr[i] ≤ 109