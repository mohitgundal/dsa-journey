/*
🧩 Problem: Missing Elements of a Range in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/incomplete-array3859/1

🧠 Approach:
- First, find the minimum and maximum elements in the array.
- Use a HashSet to store all unique elements of the array.
- The total number of elements in the complete range from min to max is `(max - min + 1)`.
- The number of missing elements will be equal to:
      (Total elements in the range) - (Number of unique elements present)
- Return this count as the result.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(n)

📘 Example:
Input: arr[] = [205, 173, 102, 324, 957]
Output: 851
Explanation: The maximum element is 957 and the minimum element is 102. Total elements from 102 to 957 = 854, 
out of which 3 are already present. So answer is 851.

Input: arr[] = [3, 4, 4, 8]
Output: 3
Explanation: The maximum element is 8 and the minimum element is 3. Total elements from 3 to 8 = 6, 
out of which 3 are already present. So, answer is 3.
*/

// User function Template for Java

class Solution {
    int countElements(int[] arr) {
        // code here
        int n = arr.length;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        
        HashSet<Integer> res = new HashSet<>();
        
        for(int i=0; i<n; i++){
            res.add(arr[i]);
            if(arr[i]<minNum){
                minNum = arr[i];
            }
            
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        
        return (maxNum - minNum + 1) - res.size();
    }
}
