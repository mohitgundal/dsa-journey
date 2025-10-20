/*
🧩 Problem: Sum of All SubArrays
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1

🧠 Approach:
- Instead of generating all subarrays (which takes O(n²) time), 
  we use the contribution technique.
- Each element `arr[i]` contributes to several subarrays.
- The number of subarrays including `arr[i]` is `(i + 1) * (n - i)`:
   → `(i + 1)` = ways to choose a starting index up to `i`
   → `(n - i)` = ways to choose an ending index from `i` to `n - 1`
- So, total contribution of `arr[i]` = `arr[i] * (i + 1) * (n - i)`
- Summing up these contributions for all elements gives the total sum.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 2, 3] 
Output: 20
Explanation: 
All subarray sums are: [1]=1, [2]=2, [3]=3, [1,2]=3, [2,3]=5, [1,2,3]=6 
Total sum = 1 + 2 + 3 + 3 + 5 + 6 = 20.
*/

class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        int result = 0;
        
        for(int i = 0; i < n; i++){
            result += (arr[i] * (i + 1) * (n - i));
        }
        
        return result;
    }
}
