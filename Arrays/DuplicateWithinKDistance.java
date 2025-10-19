/*
🧩 Problem: Duplicate Within K Distance
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/kth-distance3757/1

🧠 Approach:
- Use a HashSet to keep track of the last 'k' elements seen in the array.
- For each element:
  🔹 If it's already present in the set → a duplicate exists within distance k → return true.
  🔹 Otherwise, add it to the set.
  🔹 If window size exceeds 'k', remove the element that is (k+1) distance away (arr[i - k]).
- If traversal completes with no duplicates found → return false.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(k)

📘 Example:
Input:  arr[] = [1, 2, 3, 4, 1, 2, 3, 4], k = 3  
Output: false  
Explanation: All duplicates are more than k distance away.

Input:  arr[] = [10, 5, 3, 4, 3, 5, 6], k = 3  
Output: true  
Explanation: Element 3 repeats within distance 2 (less than or equal to k = 3).
*/

import java.util.*;

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // If duplicate found within window
            if (set.contains(arr[i]))
                return true;

            // Add current element
            set.add(arr[i]);

            // Remove element that's now more than 'k' distance away
            if (i >= k)
                set.remove(arr[i - k]);
        }

        return false;
    }
}
