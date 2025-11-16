/*
🧩 Problem: Max Circular Subarray Sum
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1


🧠 Approach (Kadane's + Circular Logic):

To find the maximum circular subarray sum, we use two ideas:
1️⃣ **Normal Kadane’s Algorithm (Non-Circular Maximum Subarray)**
- Find the maximum subarray sum in the normal array.
- This covers cases like a simple max subarray inside the array.
2️⃣ **Circular Subarray Case**
In a circular array, the maximum subarray can wrap around the end.
To compute this:
- Find the **minimum subarray sum** using Kadane’s logic (by flipping min/max).
- Subtract this minimum sum from the total array sum:
      circularSum = totalSum - minSum
This effectively gives the maximum “wrap-around” subarray.
3️⃣ **Edge Case**
If all elements are negative:
- minSum == totalSum  
  (because the whole array itself is the minimum subarray)
- In this case, circular sum becomes 0, which is invalid.
So we return only the normal Kadane result.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)


📘 Example:
Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, 
which gives maximum sum as 22.

Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
*/

class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i=0; i<arr.length; i++){
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);
            
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        if(minSum == totalSum)
        return normalSum;
        
        return Math.max(normalSum, circularSum);
    }
}
