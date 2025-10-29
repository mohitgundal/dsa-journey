/*
🧩 Problem: Count pairs with absolute difference equal to k
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/pairs-with-difference-k1713/1

🧠 Approach:
- We need to count pairs (i, j) such that |arr[i] - arr[j]| = k.
- To do this efficiently, we use a HashMap to keep track of the frequency of each element 
  as we iterate through the array.
- For each element `x` in the array:
   1️⃣ Check if `(x + k)` already exists in the map — these elements can form valid pairs with `x`.
   2️⃣ Check if `(x - k)` exists in the map — these can also form valid pairs.
   3️⃣ Add the frequency of both `(x + k)` and `(x - k)` to our total count.
   4️⃣ Then, update the frequency of the current element `x` in the map using 
       `res.put(x, res.getOrDefault(x, 0) + 1);`
- This ensures each element is processed once, and all valid pairs are counted efficiently.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [1, 4, 1, 4, 5], k = 3
Output: 4
Explanation: There are 4 pairs with absolute difference 3, the pairs are {1, 4}, {1, 4}, {4, 1} and {1, 4}.

Input: arr[] = [8, 16, 12, 16, 4, 0], k = 4
Output: 5
Explanation: There are 5 pairs with absolute difference 4, the pairs are {8, 12}, {8, 4}, {16, 12}, {12, 16}, {4, 0}.

*/

// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> res = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(res.containsKey(arr[i] + k)){
                count += res.get(arr[i] + k);
            }
            
            if(res.containsKey(arr[i] - k)){
                count += res.get(arr[i] - k);
            }
            
            res.put(arr[i], res.getOrDefault(arr[i] ,0) + 1);
        }
        
        return count;
    }
}
