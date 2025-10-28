/*
🧩 Problem: Intersection of Two Arrays
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1

🧠 Approach:
- Use a HashSet `as` to store all unique elements from the first array `a`.
- Traverse the second array `b` and for each element:
  - If it exists in `as` and hasn’t been added to the result yet, add it to the result.
  - Use another HashSet `rs` to keep track of elements already added to the result to avoid duplicates.
- Return the ArrayList `res` containing all unique common elements between `a` and `b`.

🕒 Time Complexity: O(n + m)
💾 Space Complexity: O(n)

📘 Example:
Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
Output: [1]
Explanation: 1 is the only common element present in both the arrays.

Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
Output: []
Explanation: No common element in both the arrays.
*/

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        Set<Integer> as = new HashSet<>();
        Set<Integer> rs = new HashSet<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int num: a) as.add(num);
        
        for(int i=-0; i<b.length; i++){
            if(as.contains(b[i]) && !rs.contains(b[i])){
                rs.add(b[i]);
                res.add(b[i]);
            }
        }
        
        return res;
    }
}
