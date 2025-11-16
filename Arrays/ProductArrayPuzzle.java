/*
🧩 Problem: product Array Puzzle
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

🧠 Approach:
- First traverse the array to count how many zeros exist and compute the product of all **non-zero** elements.
- If there are:
  ✔ No zeros → For each index i, result[i] = totalProduct / arr[i].  
  ✔ One zero → Only the index containing zero gets the product of all non-zero elements; all other positions become 0.  
  ✔ More than one zero → Every value in the result becomes 0 (because every product will include at least one zero).
- This avoids division by zero and ensures we don't multiply by zero while computing the total product.


🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.


Input: arr[] = [12, 0]
Output: [0, 12]
Explanation: For i = 0, res[i] is 0.
For i = 1, res[i] is 12.
*/

// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int zeros = 0, idx = -1, prod = 1;
        int n = arr.length;
        
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                zeros++;
                idx = i;
            }
            else{
                prod *= arr[i];
            }
        }
            
            int[] res = new int[n];
            Arrays.fill(res, 0);
            
            if(zeros == 0){
                for(int i = 0; i<n; i++)
                    res[i] = prod/arr[i];
            }
            
            else if(zeros == 1){
                res[idx] = prod;
            }
            
            return res;
        
    }
}
