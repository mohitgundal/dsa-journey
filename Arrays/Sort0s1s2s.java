/*
🧩 Problem: Sort 0s, 1s, 2s
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

🧠 Approach:
- Use the Dutch National Flag Algorithm.
- Keep three pointers (low, mid, high):
  • low → next position for 0
  • mid → current element
  • high → next position for 2
- Traverse the array once and swap accordingly.


🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
*/

class Solution {
    public void sort012(int[] arr) {
        // code here
     int low = 0;
     int mid = 0;
     int high = arr.length -1;
     
     while(mid<=high){
         if(arr[mid]==0){
             int temp = arr[low];
             arr[low] = arr[mid];
             arr[mid] = temp;
             
             low++;
             mid++;
         }
         else if(arr[mid] == 1){
             mid++;
         }
         
         else{
             int temp = arr[mid];
             arr[mid] = arr[high];
             arr[high] = temp;
             
             high--;
         }
     }
    }
}
