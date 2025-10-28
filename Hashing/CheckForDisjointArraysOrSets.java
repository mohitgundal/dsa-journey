/*
🧩 Problem: Check for Disjoint Arrays or Sets
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/check-for-disjoint-sets-or-arrays/1

🧠 Approach:
- Store all elements of the first array (a[]) in a HashMap or HashSet.
- Then, iterate through the second array (b[]).
- If any element of b[] already exists in the map/set, it means both arrays share a common element — return false.
- If no such element is found after checking all of b[], return true.

🕒 Time Complexity: O(n + m)
💾 Space Complexity: O(n)

📘 Example:
Input: a[] = [12, 34, 11, 9, 3], b[] = [7, 2, 1, 5]
Output: true 
Explanation: There is no common element in both the sets.

Input: a[] = [1, 2, 3, 4], b[] = [4, 3, 2, 1]
Output: false
Explanation: All the elements are common in both the arrays.
*/

// User function Template for Java
class Solution {
    public boolean areDisjoint(int[] a, int[] b) {
        // code here
        Map<Integer, Integer> res = new HashMap<>();
        
        for(int num: a){
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        
        for(int num: b){
            if(res.containsKey(num)){
                return false;
            }
        }
        
        return true;
    }
}
