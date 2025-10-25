/*
🧩 Problem: Common in 3 sorted Arrays
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/common-elements1132/1

🧠 Approach:
- Since all three arrays are **sorted**, we can efficiently find their common elements using a **three-pointer approach**.
- Initialize pointers `i`, `j`, and `k` at 0 for `arr1`, `arr2`, and `arr3` respectively.
- Traverse all arrays simultaneously:
  1️⃣ If `arr1[i] == arr2[j] == arr3[k]`, it’s a common element → add it to the result list and move all three pointers forward.
  2️⃣ If `arr1[i] < arr2[j]`, increment `i` to catch up.
  3️⃣ Else if `arr2[j] < arr3[k]`, increment `j`.
  4️⃣ Otherwise, increment `k`.
- After adding a common element, **skip duplicate values** in all three arrays to avoid repetition.
- Continue until any one array is completely traversed.

🕒 Time Complexity: O(n1 + n2 + n3)
💾 Space Complexity: O(1)

📘 Example:
Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
Output: [20, 80]
Explanation: 20 and 80 are the only common elements in arr1, arr2 and arr3.
*/

// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        int i=0, j=0, k=0;
        
        List<Integer> common = new ArrayList<>();
        
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);
            
            if(a==b && b==c){
                common.add(a);
                i++;
                j++;
                k++;
                
                
                while(i<arr1.size() && arr1.get(i).equals(arr1.get(i-1))) i++;
                while(j<arr2.size() && arr2.get(j).equals(arr2.get(j-1))) j++;
                while(k<arr3.size() && arr3.get(k).equals(arr3.get(k-1))) k++;
            }
            else if(a<b)
            i++;
            else if(b<c)
            j++;
            else 
            k++;
        }
        
        return common;
    }
}
