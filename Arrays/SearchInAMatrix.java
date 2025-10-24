/*
🧩 Problem: Search element in a 2D matrix
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/search-in-a-matrix--021840/0?page=1&category=Arrays&sortBy=difficulty
🧠 Approach:
- Traverse through all elements using nested loops.
- Time Complexity: O(n*m)
- Space Complexity: O(1)
*/

class Solution {
    boolean search(int mat[][], int x) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) return true;
            }
        }
        return false;
    }
}

// Test (for local run only)
public class SearchElementInMatrix {
    public static void main(String[] args) {
        int[][] mat = {{6, 23, 21}, {4, 45, 32}, {69, 11, 87}};
        int x = 32;
        Solution sol = new Solution();
        System.out.println(sol.search(mat, x)); // true
    }
}
