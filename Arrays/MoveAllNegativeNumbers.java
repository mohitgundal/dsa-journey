/*
🧩 Problem: Move all negative numbers to beginning and positive to end with constant extra space
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/dsa/move-negative-numbers-beginning-positive-end-constant-extra-space/
⚠️ Note: No “Try It” section available.
🧪 Tested on: GFG IDE → https://ide.geeksforgeeks.org/YOUR_LINK
✅ Status: Working fine for multiple test cases.

🧠 Approach:
- Use two pointers: 
  - `i` traverses every element of the array.
  - `j` tracks the position where the next negative number should be placed.
- Traverse the array from left to right.
- Whenever a negative number is found at index `i`, swap it with the element at index `j` and increment `j`.
- This ensures that all negative numbers are moved to the front while maintaining constant extra space.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
Explanation: Note that there is no positive number on left side of Array
*/

class Main {
    
    static int[] move(int arr[]){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j++;
            }
        }
        return arr;
    }
    
  public static void main(String[] args) {
    // System.out.println("Hello Geek!");
    
     int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);
        
        for(int num: arr){
            System.out.print(num + " ");
        }
        
        System.out.println();
  }
}
