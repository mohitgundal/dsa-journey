/*
🧩 Problem: Count 1's in Sorted Binary Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1

🧠 Approach:
- The array is sorted in non-increasing order (all 1's come before 0's).
- Use Binary Search to find the **last occurrence of 1** instead of counting linearly.
- Initialize two pointers: `low = 0`, `high = n - 1`.
- Calculate `mid = (low + high) / 2` on each iteration.
   🔹 If `arr[mid] == 0`, move left (`high = mid - 1`), since 1's are before 0's.  
   🔹 If `arr[mid] == 1` and (it's the last element OR `arr[mid + 1] != 1`), then `mid + 1` gives the total count of 1's.  
   🔹 Otherwise, move right (`low = mid + 1`) to find the last 1.
- If no 1 is found, return 0.

🕒 Time Complexity: O(log n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 1, 1, 1, 1, 1, 1]
Output: 7
Explaination: Count of 1's in the array is 7.
*/

class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while(low<= high){
            int mid = (low + high)/2;
            
            if(arr[mid] ==0){
                high = mid - 1;
            }
            else if(mid == n-1 || arr[mid+1] != 1){
                return mid + 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return 0;
    }
}
