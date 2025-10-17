/*
🧩 Problem: Check if an Array is Sorted
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

🧠 Approach:
- Use recursion to check if each element is greater than or equal to the previous one.
- Base Case:
  → If the array has 0 or 1 element, it is sorted.
- Recursive Case:
  → Check if the last two elements are in order (arr[n-1] >= arr[n-2]).
  → If true, recursively check the rest of the array.
- If all checks pass, return true.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n) (due to recursive stack)

📘 Example:
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted in non-decreasing order.
*/

class Solution {
    public boolean isSorted(int[] arr) {
        // Call the recursive helper function
        return isSortedHelper(arr, arr.length);
    }
    
    static boolean isSortedHelper(int arr[], int n) {
        // Base case: if array has 0 or 1 element, it's sorted
        if (n == 1 || n == 0) {
            return true;
        }
        
        // Check last two elements and recursively check the rest
        return arr[n - 1] >= arr[n - 2] && isSortedHelper(arr, n - 1);
    }
}
