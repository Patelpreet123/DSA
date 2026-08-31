# [Subarrays with equal 1s and 0s](https://www.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1)
## Medium
Given an array arr[] containing 0s and 1s. Count the number of subarrays having equal number of 0s and 1s. 
Examples:
Input: arr[] = [1, 0, 0, 1, 0, 1, 1]
Output: 8
Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5) ,(2, 5), (0, 5), (1, 6)
Input: arr[] = [1, 1, 1, 1, 0]
Output: 1
Explanation: The index range for the subarray is (3,4).
Constraints:1 ≤ arr.size() ≤ 1050 ≤ arr[i] ≤ 1