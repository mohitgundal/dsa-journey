/*
🧩 Problem: Most Frequent Element in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1

🧠 Approach:
- Use a HashMap to count how many times each element appears in the array.
- Traverse the array and update the frequency of each element in the map.
- After building the frequency map, iterate through all entries to find:
  - The element with the highest frequency.
  - If two elements have the same frequency, choose the one with the larger value.
- Return that element as the most frequent element in the array.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.

Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.

*/

class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        int n = arr.length;
        
        HashMap<Integer, Integer> ans = new HashMap<>();
        
        
        for(int i = 0; i<n; i++){
            ans.put(arr[i], ans.getOrDefault(arr[i], 0) + 1);
        }
        
        int res = -1, maxCnt = 0;
        
        for(var entry: ans.entrySet()){
            int val = entry.getKey(), cnt = entry.getValue();
            if(maxCnt < cnt || (cnt == maxCnt && val > res)){
                maxCnt = cnt;
                res = val;
            }
        }
        
        return res;
    }
}
