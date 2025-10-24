/*
🧩 Problem: Largest Element in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

🧠 Approach:
- Initialize a variable `max` with the first element of the array.
- Traverse the entire array using a loop.
- For each element, compare it with `max`.
- If the current element is greater than `max`, update `max`.
- After the loop ends, `max` will store the largest element in the array.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
*/

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return max;
    }
}
