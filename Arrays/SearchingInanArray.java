/*
🧩 Problem: First Occurrence in Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/searching-a-number0324/1?page=1&category=Arrays&sortBy=difficulty

🧠 Approach:
- Traverse the array linearly from left to right.
- Compare each element with k using arr.get(i).
- As soon as we find k, return (i + 1) since 1-based indexing is required.
- If we reach the end without finding it, return -1.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: k = 16, arr = [9, 7, 16, 16, 4]
Output: 3
Explanation: 16 appears first at position 3 (1-based index).
*/

import java.util.ArrayList;

class Solution {
    // Function to find first occurrence of k in the given ArrayList
    public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i + 1; // 1-based indexing
            }
        }
        return -1; // Element not found
    }
}

/* ----------------------------------------------------------
🔍 Local Testing (Not for GFG submission)
---------------------------------------------------------- */
public class FirstOccurrenceInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(9);
        arr1.add(7);
        arr1.add(16);
        arr1.add(16);
        arr1.add(4);

        int k1 = 16;
        Solution sol = new Solution();
        System.out.println(sol.search(k1, arr1)); // Output: 3

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(22);
        arr2.add(57);
        arr2.add(47);
        arr2.add(34);
        arr2.add(18);
        arr2.add(66);

        int k2 = 98;
        System.out.println(sol.search(k2, arr2)); // Output: -1
    }
}
