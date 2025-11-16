/*
🧩 Problem: K-th Largest Sum Contiguous Subarray
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/k-th-largest-sum-contiguous-subarray/1

🧠 Approach:
- Generate all possible contiguous subarrays using two nested loops.
- For each starting index `i`, keep a running sum and keep adding elements until the end of the array.
- Store every subarray sum in a list.
- After generating all subarray sums, sort the list in ascending order.
- The K-th largest element will be at index (size - k) because the list is 0-indexed.

🕒 Time Complexity: O(n^2 log k)
💾 Space Complexity:  O(log k)

📘 Example:
Input: arr[] = [3, 2, 1], k = 2 
Output: 5
Explanation: The different subarray sums we can get from the array are = [6, 5, 3, 2, 1]. Where 5 is the 2nd largest.

Input: arr[] = [2, 6, 4, 1], k = 3
Output: 11
Explanation: The different subarray sums we can get from the arrayare = [13, 12, 11, 10, 8, 6, 5, 4, 2, 1]. Where 11 is the 3rd largest.
*/

class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                list.add(sum);
            }
        }
        
        Collections.sort(list);
        int size = list.size();
        return list.get(size - k);
    }
}
