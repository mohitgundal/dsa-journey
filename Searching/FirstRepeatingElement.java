/*
🧩 Problem: First Repeating Element in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/first-repeating-element4018/1

🧠 Approach:
- We need to find the first element that repeats in the array — i.e., the one whose first occurrence has the smallest index.
- Use a `HashSet` to efficiently track which elements have already been seen.
- Traverse the array **from right to left**:
  - If the element is already present in the set, update `minEle` with the current index (it means this element repeats).
  - Otherwise, add the element to the set.
- Traversing backward ensures that when we find a duplicate, we store the **first (leftmost)** occurrence index.
- Finally, return the 1-based index (`minEle + 1`) if a repeating element exists, otherwise return `-1`.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
*/

class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashSet<Integer> s = new HashSet<>();
        int minEle = Integer.MAX_VALUE;
        
        for(int i= arr.length -1; i>=0; i--){
            if(s.contains(arr[i])){
                minEle = Math.min(minEle, i);
            }
            s.add(arr[i]);
        }
        
        return minEle == Integer.MAX_VALUE ? -1 : minEle + 1;
    }
}
