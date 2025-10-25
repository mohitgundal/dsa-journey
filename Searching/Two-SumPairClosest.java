/*
🧩 Problem: Two Sum-Pair Closest in Array
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1

🧠 Approach:
- Sort the given array to enable the two-pointer technique.
- Initialize two pointers: `low = 0` and `high = n - 1`.
- Maintain variables `min` (to store the smallest difference between sum and target)
  and `(i1, i2)` to store indices of the closest pair.
- While `low < high`:
  1️⃣ Calculate `sum = arr[low] + arr[high]`.
  2️⃣ If `sum` is greater than target, update the closest pair if `(sum - target)` is smaller than `min`, then move `high--`.
  3️⃣ If `sum` equals target, return this pair immediately (perfect match).
  4️⃣ If `sum` is less than target, update the closest pair if `(target - sum)` is smaller than `min`, then move `low++`.
- After the loop, return the pair with the smallest absolute difference to the target.

🕒 Time Complexity: O(n log n)
💾 Space Complexity: O(1)

📘 Example:
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of 
(4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
*/

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(arr.length<=1){
            return res;
        }
        
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        int i1 = 0;
        int i2 = 0;
        Arrays.sort(arr);
        
        while(low<high){
            int sum = arr[low] + arr[high];
            if(sum>target){
                if(min>(sum - target)){
                    min = sum - target;
                    i1 = low;
                    i2 = high;
                }
                high--;
            }
            else if(sum == target){
                res.add(arr[low]);
                res.add(arr[high]);
                return res;
            }
            else{
                if(min>(target-sum)){
                    min = target - sum;
                    i1 = low;
                    i2 = high;
                }
                low++;
            }
            
        }
        
        res.add(arr[i1]);
        res.add(arr[i2]);
        
        return res;
    }
}
