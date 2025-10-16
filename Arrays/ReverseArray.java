/*
🧩 Problem: Reverse an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/reverse-an-array/1

🧠 Approaches:
1️⃣ Naive / Optimal: Swap elements from both ends until the middle (O(n))

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)
*/

class Solution {
    public void reverseArray(int[] arr) {
        int n = arr.length;

        // Swap elements from start and end moving toward the middle
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
