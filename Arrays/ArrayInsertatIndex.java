/*
🧩 Problem: Array Insert at Index
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/array-insert-at-index/1?page=1&category=Arrays&sortBy=difficulty

🧠 Approach:
- Use ArrayList’s built-in `add(index, val)` method to insert an element at a specific index.
- Java’s ArrayList automatically shifts existing elements to the right.
- Works efficiently for moderate array sizes.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr = [1, 2, 3, 4, 5], index = 2, val = 90  
Output: [1, 2, 90, 3, 4, 5]
*/

import java.util.*;

class Solution {
    // Function to insert val at a specific index in the ArrayList
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index, val);
    }
}

/* ----------------------------------------------------------
🔍 Local Testing (Not for GFG submission)
---------------------------------------------------------- */
public class InsertAtIndex {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        sol.insertAtIndex(arr1, 5, 90);
        System.out.println(arr1); // Output: [1, 2, 3, 4, 5, 90]

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        sol.insertAtIndex(arr2, 2, 90);
        System.out.println(arr2); // Output: [1, 2, 90, 3, 4, 5]
    }
}
