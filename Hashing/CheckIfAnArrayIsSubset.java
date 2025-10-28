/*
🧩 Problem: Check if an Array is Subset of Another Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

🧠 Approach:
- Use a HashMap to store the frequency (count) of each element in array `a[]`.
- Traverse through array `b[]`:
  - For each element in `b[]`, check if it exists in the map and its count is greater than zero.
  - If not found or already used (count = 0), return false — meaning `b[]` is not a subset of `a[]`.
  - Otherwise, reduce the count of that element in the map (since one occurrence is used).
- If all elements of `b[]` pass the check, return true — `b[]` is a subset of `a[]`.

🕒 Time Complexity: O(n + m)
💾 Space Complexity: O(n)

📘 Example:
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]n
Output: true
Explanation: b[] is a subset of a[]

Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]

*/


class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int num: a){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for(int num: b){
            if(!freq.containsKey(num) || freq.get(num) == 0){
                return false;
            }
            freq.put(num, freq.get(num)-1);
        }
        
        return true;
    }
}
