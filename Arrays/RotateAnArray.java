/*
🧩 Problem: Rotate an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

🧠 Approach:
- We need to rotate the array by `d` elements in counter-clockwise direction.
- Step 1: Take modulo of `d` with `n` (i.e., d = d % n) to handle cases where d > n.
- Step 2: Create a temporary array to store rotated elements.
- Step 3: Copy elements from index `d` to `n - 1` into temp.
- Step 4: Then copy the first `d` elements to the end of temp.
- Step 5: Copy temp[] back to the original array.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [1, 2, 3, 4, 5], d = 2  
Output: [3, 4, 5, 1, 2]  
Explanation: When rotated by 2 elements, the array becomes [3, 4, 5, 1, 2].
*/

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // Handle cases when d > n

        int[] temp = new int[n];
        int k = 0;

        // Step 1: Copy elements from d to end
        for (int i = d; i < n; i++) {
            temp[k++] = arr[i];
        }

        // Step 2: Copy first d elements
        for (int i = 0; i < d; i++) {
            temp[k++] = arr[i];
        }

        // Step 3: Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
