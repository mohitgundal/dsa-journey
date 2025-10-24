/*
🧩 Problem: Union of Arrays with Duplicates
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

🧠 Approach:
- Use a HashSet to automatically store only unique elements.
- Traverse the first array `a[]` and add all elements to the set.
- Traverse the second array `b[]` and add all elements to the same set.
- Convert the set into a list to get the union of both arrays.
- (Optional) Sort the list before returning, though the driver code usually handles sorting.

🕒 Time Complexity: O(n+m)
💾 Space Complexity: O(n+m)

📘 Example:
Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.
*/

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> unionSet = new HashSet<>();
        
        for (int num: a){
            unionSet.add(num);
        }
        
        for(int num: b){
            unionSet.add(num);
        }
        
        ArrayList<Integer> unionList =  new ArrayList<>(unionSet);
        Collections.sort(unionList);
        return unionList;
    }
}
