/*
🧩 Problem: Rearrange to Make arr[i] = i
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/rearrange-an-array-such-that-arri-i3618/1

🧠 Approach:
- Sort the given array in ascending order.
- Use two pointers:
  🔹 `i` → represents the current index (0 to n-1)
  🔹 `j` → traverses the sorted array to find if the value `i` exists
- For each index `i`, move `j` until `arr[j] >= i`.
  - If `arr[j] == i`, place `arr[i] = i`
  - Otherwise, set `arr[i] = -1`
- This ensures every element is placed at its correct index if present, else replaced with -1.


🕒 Time Complexity: O(nlogn)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of them.

Input: arr[] = [0, 1, 2, 3, 4, 5] 
Output: [0, 1, 2, 3, 4, 5]
Explanation: In range 0 to 5, all number are present.
*/

// User function Template for Java
class Solution {
    public static void modifyArray(int[] arr) {
        // code
        int n = arr.length;
        Arrays.sort(arr);
        int j =0;
        
        for(int i=0; i<n; i++){
            while(j<n && arr[j]<i){
                j++;
            }
            
            if(j<n && arr[j] == i){
                arr[i] = i;
            }
            else{
                arr[i]  = -1;
            }
        }
    }
}
