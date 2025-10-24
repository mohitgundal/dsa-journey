/*
🧩 Problem: Missing in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

🧠 Approach:
- The array contains numbers from 1 to n, with one number missing.
- First, calculate `n = arr.length + 1` because one number is missing.
- Create a `hash` array of size `n + 1` to mark the presence of each number.
- Traverse the given array and mark each element as present in the `hash` array using `hash[arr[i]]++`.
- Then, traverse the `hash` array from index 1 to n.
- The index where `hash[i] == 0` represents the missing number.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
*/

class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        int[] hash = new int[n+1];
        
        for(int i=0; i<n-1; i++){
            hash[arr[i]]++;
        }
        
        for(int i=1; i<=n; i++){
            if(hash[i]==0){
                return i;
            }
        }
        
        return -1;
    }
}
