/*
🧩 Problem: Minimum Cost To Make Array Size 1
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/min-cost-to-make-size-1/1

🧠 Approach:
- We need to repeatedly remove the larger of any chosen pair until only one element remains.
- The cost of each operation equals the smaller of the chosen pair.
- To minimize the total cost, always include the smallest element in each operation,
  because it adds the least possible cost.
- Therefore, the total cost will be (n - 1) * smallest_element.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [4, 3, 2]
Output: 4
Explanation:
Step 1: Choose (4, 2) → remove 4 → cost = 2 → array = [2, 3]
Step 2: Choose (2, 3) → remove 3 → cost = 2 → array = [2]
Total cost = 2 + 2 = 4
*/

class Solution {
    public int cost(int[] arr) {
        int n = arr.length; 
        int min = arr[0];
        
        // Find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Total cost formula
        return min * (n - 1);
    }
}
