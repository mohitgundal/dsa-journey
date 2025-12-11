/*
🧩 Problem: Count Possible Traingles
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1

🧠 Approach:
- First, sort the array so that the sides are in non-decreasing order.
- Fix each element arr[i] (starting from index 2) as the largest side of the triangle.
- For every such largest side, use two pointers:
    - `left` starts at the beginning of the array.
    - `right` starts just before `i`.
- If arr[left] + arr[right] > arr[i], then all elements from arr[left] to arr[right - 1] 
  will also form valid triangles with arr[i] (because the array is sorted).  
  Add (right - left) to the result and move `right` one step left.
- Otherwise, increase `left` to try a larger value.
- Continue until all valid combinations are counted.

🕒 Time Complexity: O(n^2)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle. 

Input: arr[] = [10, 21, 22, 100, 101, 200, 300]
Output: 6
Explanation: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300].

Input: arr[] = [1, 2, 3]
Output: 0
Explanation: No triangles are possible.
*/

class Solution {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n= arr.length;
        int res = 0;
        
        for(int i=2; i<n; i++){
            int left = 0;
            int right = i-1;
            
            while(left< right){
                if(arr[left] + arr[right] > arr[i]){
                    res += right - left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        
        return res;
    }
}
