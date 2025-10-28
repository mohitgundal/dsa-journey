/*
🧩 Problem: Check if Two Arrays are Equal or Not
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1

🧠 Approach:
- Use a HashMap to store the frequency (count) of each element from the first array `a`.
- Traverse the second array `b` and decrease the frequency for each element found in the map.
- If an element from `b` doesn’t exist in the map or its count goes below zero, 
  the arrays are not equal.
- Finally, verify that all frequency counts in the map are zero — 
  if true, both arrays contain exactly the same elements with the same frequencies.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]

Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.
*/

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Map<Integer, Integer> res = new HashMap<>();
        
        for(int num: a){
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        
        for(int num: b){
            if(!res.containsKey(num)) return false;
            res.put(num, res.get(num) - 1);
            if(res.get(num) < 0) return false;
        }
        
        for(int count : res.values()){
            if(count !=0) return false;
        }
        
        return true;
    }
}
