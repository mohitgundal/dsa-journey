/*
🧩 Problem: Generating All SubArrays
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/generating-all-subarrays/1

🧠 Approach:
- Use three nested loops to generate all possible subarrays.
- The first loop chooses the starting index `i` of the subarray.
- The second loop chooses the ending index `j` of the subarray.
- The innermost loop collects all elements from `i` to `j` and stores them in a temporary list.
- Each generated subarray is then added to the main result list.
- Finally, return the list containing all subarrays.

🕒 Time Complexity: O(n³)
💾 Space Complexity: O(n²)

📘 Example:
Input: arr[] = [1, 2, 3]
Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Explanation: 
Starting with index 0 → [1], [1, 2], [1, 2, 3]
Starting with index 1 → [2], [2, 3]
Starting with index 2 → [3]
Hence, all possible continuous subarrays are generated.
*/

// User function Template for Java
import java.util.*;

class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> sub = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sub.add(arr[k]);
                }
                result.add(sub);
            }
        }
        
        return result;
    }
}
