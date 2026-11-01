# [Shortest Transformation Length in a Word List](https://www.geeksforgeeks.org/problems/word-ladder/1)
## Hard
Given two distinct words s and e, and a list of unique words words[], where all words have the same length, find the length of the shortest transformation sequences from start to end.
A valid transformation sequence must satisfy the following conditions:

Only one character can be changed in each transformation.
Every transformed word must exist in words[], including e.
All words consist only of lowercase English letters.
s&nbsp;may or may not be present in words[].

Return the length of the shortest transformation sequence from s to e. If no such sequence exists, return 0.
Examples:
Input: words[] = ["des", "der", "dfr", "dgt", "dfs"], s = "der", e = "dfs"
Output: 3
Explanation: The length of the shortest transformation sequence from "der" to "dfs" is 3 i.e "der" -&gt; "dfr" -&gt; "dfs".

Input: words = ["geek", "gefk"], s = "gedk", e = "geek", 
Output: 2
Explanation: The length of the shortest transformation sequence from "gedk" to "geek" is 2 i.e "gedk" -&gt; "geek"
Input: words[] = ["poon", "plee", "same", "poie", "plea", "plie", "poin"], s = "toon", e = "plea",
Output: 7 
Explanation: The length of the shortest transformation sequence from "toon" to "plea" is 7 i.e., toon -&gt; poon -&gt; poin -&gt; poie -&gt; plie -&gt; plee -&gt; plea 
Constraints:1 ≤ n ≤ 5 * 103, where n is the length of words1 ≤ m ≤ 10, where m is the length of words[i]