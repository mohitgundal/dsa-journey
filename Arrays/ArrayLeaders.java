/*
🧩 Problem: Array Leaders
📍 Platform: GeeksforGeeks
🔗 Link: http://geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

🧠 Approach:
- Traverse the array from right to left.
- Keep track of the maximum element seen so far (`maxRight`).
- Any element greater than or equal to `maxRight` is a leader.
- Add each leader to a list, then reverse it at the end to maintain order.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int maxRight = arr[n-1];
        result.add(maxRight);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}
