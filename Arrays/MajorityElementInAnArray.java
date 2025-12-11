/*
🧩 Problem: Majority Elements in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

🧠 Approach (Moore’s Voting Algorithm):

This problem is solved using the Moore’s Voting Algorithm, which efficiently 
identifies a possible majority candidate in linear time.

1. **Candidate Selection Phase**
   - Initialize `candidate = -1` and `count = 0`.
   - Traverse the array:
        • If `count == 0`, pick the current element as the new candidate.  
        • If the current element equals the candidate, increase `count`.  
        • Otherwise, decrease `count`.
   - This cancellation process ensures that if a majority element exists 
     (frequency > n/2), it will remain as the final candidate.

2. **Validation Phase**
   - The candidate found may not always be a valid majority (especially if no 
     majority exists).
   - Traverse the array again to count the occurrences of the candidate.
   - If its frequency is greater than `n/2`, return the candidate; 
     otherwise return `-1`.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.

Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.

Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.
*/

class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int candidate = -1;
        int count = 0;
        
        for(int num: arr){
            if(count == 0){
                candidate = num;
                count  = 1;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        
        count = 0;
        for(int num: arr){
            if(candidate == num){
                count++;
            }
        }
        
        if(count > n/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}
