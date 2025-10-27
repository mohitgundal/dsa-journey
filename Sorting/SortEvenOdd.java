/*
🧩 Problem: Sort even-placed in increasing and odd-placed in decreasing order
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/dsa/sort-even-placed-elements-increasing-odd-placed-decreasing-order/

🧠 Approach:
- Traverse the array and separate elements at even indices and odd indices into two separate lists.
- Sort the list of even-index elements in **increasing order**.
- Sort the list of odd-index elements in **decreasing order**.
- Merge the two lists back into the original array: first even-indexed elements, then odd-indexed elements.
- Print the modified array.


🕒 Time Complexity: O(n log n)
💾 Space Complexity: O(n)

📘 Example:
Input:  arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
Output: arr[] = {0, 2, 4, 6, 7, 5, 3, 1}
Explanation:
Even-place elements : 0, 2, 4, 6
Odd-place elements : 1, 3, 5, 7
Even-place elements in increasing order : 
0, 2, 4, 6
Odd-Place elements in decreasing order : 
7, 5, 3, 1

Input: arr[] = {3, 1, 2, 4, 5, 9, 13, 14, 12}
Output: {2, 3, 5, 12, 13, 14, 9, 4, 1}
Explanation:
Even-place elements : 3, 2, 5, 13, 12
Odd-place elements : 1, 4, 9, 14
Even-place elements in increasing order : 
2, 3, 5, 12, 13
Odd-Place elements in decreasing order : 
14, 9, 4, 1 
*/

import java.util.*; 
class Main {
    
    static void getEvenOdd(int[] arr){
        List<Integer> evenElems = new ArrayList<>();
        List<Integer> oddElems = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                evenElems.add(arr[i]);
            }
            else{
                oddElems.add(arr[i]);
            }
        }
        
        Collections.sort(evenElems);
        Collections.sort(oddElems, Collections.reverseOrder());
        
        int count = 0;
        for(int num: evenElems){
            arr[count++] = num;
        }
        
        for(int num: oddElems){
            arr[count++] = num;
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
  public static void main(String[] args) {
      
      int[] arr = {0,1,2,3,4,5,6,7};
      getEvenOdd(arr);
      
    System.out.println("Hello Geek!");
  }
}
