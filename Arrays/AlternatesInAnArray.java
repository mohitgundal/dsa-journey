/*
🧩 Problem: Alternate Elements in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1

🧠 Approach:
- Use an ArrayList to store every alternate element (starting from index 0).
- Use recursion to move two steps ahead each time.
- Works efficiently and avoids extra loops.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
*/

import java.util.ArrayList;

class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternatesRec(arr, 0, res);
        return res;
    }
    
    static void getAlternatesRec(int arr[], int idx, ArrayList<Integer> res) {
        if (idx < arr.length) {
            res.add(arr[idx]);
            getAlternatesRec(arr, idx + 2, res);
        }
    }
}
