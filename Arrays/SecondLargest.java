/*
🧩 Problem: find Second Largest Element in an array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/second-largest3735/1
🧠 Approach:
- Sort the Array and traverse through array in a reverse order
- Time Complexity: O(nlogn)
- Space Complexity: O(1)
*/

class Solution {
    static int getSecondLargest(int[] arr) {
        // code here
        
        int n = arr.length;
        
        
        Arrays.sort(arr);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

  // Test (for local run only)    
    public static void main(String[] args){
        // int arr[] = {25,58,99,65,74,3,114,1};
        // int arr[] = {12, 35, 1, 10, 34, 1};
        int arr[] = {10, 5, 10};
        System.out.println(getSecondLargest(arr));
    }
}
