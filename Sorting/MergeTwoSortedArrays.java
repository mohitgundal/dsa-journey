/*
🧩 Problem: Merge Two Sorted Arrays
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

🧠 Approach:
- Use two pointers — one starting from the end of the first array (`a[]`)
  and the other from the start of the second array (`b[]`).
- If any element in `a[]` is greater than the element in `b[]`, swap them.
- Continue this process to ensure that all smaller elements move to `a[]`
  and larger ones to `b[]`.
- Finally, sort both arrays individually to get the merged sorted order
  without using extra space.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].
*/

class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        
        int i=n-1;
        int j=0;
        
        while(i>=0 && j<m){
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
