/*
🧩 Problem: Sort String of Characters
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/sort-a-string2943/1

🧠 Approach:  
- Convert the given string into a **character array** for easy manipulation.  
- Use the built-in `Arrays.sort()` method to sort the characters in **ascending order** (lexicographically).  
- Convert the sorted character array back into a string and return it as the result.  

🕒 Time Complexity: O(|S| * log |S|)
💾 Space Complexity: O(1)

📘 Example:
Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
*/

// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        return new String(arr);
    }
}
