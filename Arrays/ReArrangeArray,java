/*
🧩 Problem: Rearrange Array Such That Even Positioned Are Greater Than Odd  
📍 Platform: GeeksforGeeks  
🔗 Link: https://www.geeksforgeeks.org/dsa/rearrange-array-such-that-even-positioned-are-greater-than-odd/  

🧠 Approach:
- First, sort the array in ascending order.  
- Use two pointers:
  🔹 `ptr1` → starts from the smallest element (for odd positions)  
  🔹 `ptr2` → starts from the largest element (for even positions)  
- Create a result array of the same size filled with 0s initially.  
- Now traverse the result array:
   - If the position is **even (1-based)**, place the **largest remaining** element.
   - If the position is **odd (1-based)**, place the **smallest remaining** element.  
- This ensures even positions always have values greater than the previous (odd) ones.

🕒 Time Complexity: O(n log n) — due to sorting  
💾 Space Complexity: O(n) — for the result array  

📘 Example:
Input: arr[] = [1, 2, 2, 1]  
Output: [1, 2, 1, 2]  
Explanation:
- 1st (odd) → 1 (smallest)
- 2nd (even) → 2 (largest)
- 3rd (odd) → 1 (next smallest)
- 4th (even) → 2 (next largest)
Thus, all even positions have values greater than their previous odd positions.
*/

// User function Template for Java

class Solution {
    // Method to rearrange the array
    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        // Sort the array first
        Collections.sort(arr);

        int n = arr.size();
        int ptr1 = 0, ptr2 = n - 1;

        // Create a new ArrayList with n elements initialized to 0
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));

        // Fill the result array as per the pattern
        for (int i = 0; i < n; i++) {
            // (i+1) is used because the problem considers 1-based indexing
            if ((i + 1) % 2 == 0) {
                // Even position → assign the largest available element
                result.set(i, arr.get(ptr2--));
            } else {
                // Odd position → assign the smallest available element
                result.set(i, arr.get(ptr1++));
            }
        }

        return result;
    }
}
