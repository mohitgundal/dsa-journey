/*
🧩 Problem: Palindromic Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category=Arrays&sortBy=difficulty
🧠 Approaches: 
1️⃣ Naive: Check each number by reversing its digits — O(n log n)
✅ Expected / Optimal: Same approach (since input size is small, this is optimal)

🕒 Time Complexity: O(n log n)
💾 Space Complexity: O(1)
*/

class Solution {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;
        // add code here.
        for(int i =0; i<n; i++){
        if(!isPalinNum(arr[i])){
            return false;
        }
            
        }
        return true;
    }
    
    public static boolean isPalinNum(int num){
        int original = num;
        int reverse = 0;
        
        while(num>0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num /=10;
        }
        return original == reverse;
    }
}
