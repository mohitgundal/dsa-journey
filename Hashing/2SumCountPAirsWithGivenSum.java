/*
🧩 Problem: 2 Sum - Count pairs with given sum
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1

🧠 Approach:
- Use a HashMap to store the frequency of each element while traversing the array.
- For every element `arr[i]`, check if the complement `(target - arr[i])` already exists in the map.
- If it exists, it means those elements form valid pairs with the current element, 
  so add the frequency of the complement to the count.
- Then, update the frequency of the current element in the map.
- This ensures we count all unique pairs efficiently in a single pass.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 

Input: arr[] = [1, 1, 1, 1], target = 2 
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
*/

class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> ans = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(ans.containsKey(target - arr[i])){
                count += ans.get(target - arr[i]);
            }
            
            ans.put(arr[i], ans.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}
