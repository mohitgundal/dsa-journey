/*
🧩 Problem: Sort an Array of 2 types - 0's and 1's
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

🧠 Approach:
- The array contains only 0’s and 1’s, so the goal is to place all 0’s first and all 1’s after them.
- First, traverse the array once to **count the number of 0’s**.
- Then, fill the first `count` indices of the array with 0.
- Fill the remaining indices with 1.
- This ensures the array is sorted with all 0’s before 1’s.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]
*/

// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
        }
        
        for(int i=0; i<count; i++){
            arr[i] = 0;
        }
        
        for(int i=count; i<n; i++){
            arr[i] = 1;
        }
    }
}
