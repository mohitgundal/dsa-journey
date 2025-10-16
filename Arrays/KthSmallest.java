/*
🧩 Problem: Find the k-th Smallest Element in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

🧠 Approach:
- Use a frequency array to count occurrences of each number.
- Traverse the frequency array in increasing order and keep a running count.
- When the running count reaches k, return the current number.
- This avoids sorting the array and works efficiently if max value is not too large.

🕒 Time Complexity: O(n + maxVal)
💾 Space Complexity: O(maxVal)

📘 Example:
Input: arr = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: Sorted order is [3, 4, 7, 10, 15, 20]. The 3rd smallest element is 7.
*/

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Step 1: Find maximum value in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        // Step 2: Create frequency array
        int[] freq = new int[maxVal + 1];

        // Step 3: Count occurrences of each number
        for (int num : arr) {
            freq[num]++;
        }

        // Step 4: Traverse freq[] to find k-th smallest
        int count = 0;
        for (int i = 0; i <= maxVal; i++) {
            count += freq[i];
            if (count >= k) {
                return i; // i is the k-th smallest element
            }
        }

        return -1; // if k is invalid
    }
}
