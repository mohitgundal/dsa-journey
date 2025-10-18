/*
🧩 Problem: Remove Duplicates from Sorted Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

🧠 Approach:
- Create a HashSet to keep track of elements that have already appeared.
- Traverse the array from start to end.
- For each element:
    → If it has not been seen before, add it to both the HashSet and the result list.
    → If it’s already present in the HashSet, skip it.
- Finally, return the result list which contains only unique elements in their original order.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] 
so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.
*/

class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result  = new ArrayList<>();
        
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num:arr){
            if(!seen.contains(num)){
                seen.add(num);
                result.add(num);
            }
        }
        
        return result;
    }
}
