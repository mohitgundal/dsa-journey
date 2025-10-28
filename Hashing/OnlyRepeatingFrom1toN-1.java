/*
🧩 Problem: Only Repeating From 1 To n-1
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/find-repetitive-element-from-1-to-n-1/1

🧠 Approach:
- The array contains numbers from 1 to n-1, but one number repeats.
- We can find the duplicate by comparing:
    → The actual sum of all elements in the array.
    → The expected sum of numbers from 1 to n-1 (using the formula n*(n+1)/2).
- Since one number repeats, the difference between these two sums will be the duplicate.
- Use `long` for the expected sum to avoid integer overflow for large n.
- Finally, return the difference as an `int` (since array elements are integers).

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [1, 5, 1, 2, 3, 4]
Output: 1  
Explanation: The number 1 is the only repeating element.

Input: arr[] = [1, 1]  
Output: 1
Explanation: The array is of size 2 with both elements being 1, making 1 the repeating element.

*/


// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n = arr.length;
        
        int sum = 0;
        
        for(int num: arr){
            sum += num;
        }
        
        long expectedSum = (long) (n-1) * (n-1+1)/2;
        
        return (int) (sum - expectedSum);
    }
}
