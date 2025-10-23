/*
🧩 Problem: Unique Number in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/find-unique-number/1

🧠 Approach:
- The problem uses the XOR (^) operation to find the element that appears only once.
- XOR has special properties:
  → a ^ a = 0  (any number XOR itself gives 0)
  → a ^ 0 = a  (any number XOR 0 remains unchanged)
- So, when we XOR all elements of the array:
  → All duplicate pairs cancel out to 0.
  → Only the unique element (which occurs once) remains in the result.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
*/

class Solution {
    public int findUnique(int[] arr) {
        // code here
     int res = 0;
     
     for(int i=0; i<arr.length; i++){
         res ^= arr[i];
     }
     return res;
    }
}
