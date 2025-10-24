/*
🧩 Problem: Largest Three Distinct Elements in an Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/largest-three-distinct-elements/1

🧠 Approach:
- Initialize three variables: `first`, `sec`, and `third` to store the top 3 largest distinct elements.
- Traverse the array to find the largest element (`first`).
- Traverse again to find the second largest distinct element (`sec`) which is not equal to `first`.
- Traverse once more to find the third largest distinct element (`third`) which is not equal to `first` or `sec`.
- Based on which values exist, return an array of size 1, 2, or 3 containing these distinct largest elements.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [10, 4, 3, 50, 23, 90, 90]
Output: [90, 50, 23]
Explanation: Since 90 appears two times in the given array, hence it is only counted once. Therefore, the top 3 distinct largest numbers are 90, 50 and 23.
*/

class Solution {
    public int[] getThreeLargest(int arr[]) {
        // code here
        int n = arr.length;
        int first = 0;
        int sec = 0;
        int third = 0;
        int[] newArr;
        
        for(int num: arr){
            if(num>first){
                first = num;
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]>sec && arr[i]!=first){
                sec = arr[i];
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]>third && arr[i]!=first && arr[i]!=sec){
                third = arr[i];
            }
        }
        
        if(third!=0){
            newArr = new int[3];
            newArr[0] = first;
            newArr[1] = sec;
            newArr[2] = third;
        }
        else if(sec!=0){
            newArr = new int[2];
            newArr[0] = first;
            newArr[1] = sec;
        }
        else{
            newArr = new int[1];
            newArr[0] = first;
        }
        
        return newArr;
    }
}
