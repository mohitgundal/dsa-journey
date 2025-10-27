/*
🧩 Problem: Sort the Matrix
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/sorted-matrix2333/1

🧠 Approach:
- Store all elements of the matrix in a list.
- Sort the list using `Collections.sort()` (O(N² log N)).
- Refill the matrix with sorted elements row-wise.

🕒 Time Complexity: O(N² log N)
💾 Space Complexity: O(N²)

📘 Example:
Input:
Mat = [[10,20,30],
       [5,15,25],
       [1,9,11]]
Output:
[[1,5,9],
 [10,11,15],
 [20,25,30]]
*/

// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        ArrayList<Integer> l1 = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                l1.add(Mat[i][j]);
            }
        }
        
        Collections.sort(l1);
        int curr = 0;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                Mat[i][j] = l1.get(curr++);
            }
        }
        
        return Mat;
    }
};
