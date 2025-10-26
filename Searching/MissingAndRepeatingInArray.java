/*
🧩 Problem: Missing and Repeating in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

🧠 Approach:
- The array contains numbers from 1 to n, but one number is missing and another repeats.
- Create a frequency array `freq` of size `n + 1` (since numbers start from 1).
- Traverse the given array and increment `freq[arr[i]]` for each element to record its frequency.
- Then, traverse the `freq` array from index 1 to n:
   🔹 If `freq[i] == 0`, then `i` is the missing number.  
   🔹 If `freq[i] == 2`, then `i` is the repeating number.
- Finally, return both numbers as a list — [repeating, missing].

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
*/

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int  n = arr.length;
        int[] freq = new int[n+1];
        int missing = -1;
        int repeating = -1;
        
        for(int i =0; i<n; i++){
            freq[arr[i]]++;
        }
        
        for(int i=1; i<=n; i++){
            if(freq[i]==0) missing = i;
            else if(freq[i] == 2) repeating = i;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
}
