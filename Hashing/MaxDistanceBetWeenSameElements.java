/*
🧩 Problem: Max distance between same elements
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1

🧠 Approach:
- The goal is to find the largest distance between two same numbers in the array.
- Use a **HashMap** to store the **first index** of every element when it appears for the first time.
- Traverse the array:
   1️⃣ If the element is **not present** in the map, store its index (first occurrence).
   2️⃣ If the element is **already in** the map, it means we’ve seen it before — 
       calculate the distance between the current index and its first index stored in the map.
   3️⃣ Update the maximum distance (`res`) using `Math.max(res, i - ans.get(arr[i]))`.
- Continue until all elements are processed, and return the maximum distance found.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [1, 1, 2, 2, 2, 1]
Output: 5
Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max distance is 5.

Input: arr[] = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
Output: 10
Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
*/

class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int n = arr.length;
        int res = 0;
        HashMap<Integer, Integer> ans = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(!ans.containsKey(arr[i])){
                ans.put(arr[i], i);
            }
            else{
                res = Math.max(res, i - ans.get(arr[i]));
            }
        }
        
        return res;
    }
}
