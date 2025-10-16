/*
🧩 Problem: Find Minimum and Maximum in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

🧠 Approach:
✅ Traverse the array once and compare each element to track min and max.
   - If current element > max → update max
   - If current element < min → update min

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        // Handle edge case: empty or null array
        if (arr == null || arr.length == 0) {
            return res;
        }

        int min = arr[0];
        int max = arr[0];

        // Traverse array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Add results to the list
        res.add(min);
        res.add(max);
        return res;
    }
}
