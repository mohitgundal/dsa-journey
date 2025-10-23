/*
🧩 Problem: Stock Buy and Sell
📍 Platform: GeeksforGeeks
🔗 Link: https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1

🧠 Approach:
- The goal is to maximize profit by making multiple buy-sell transactions.
- Traverse the array once using a while loop.
- Find every **local minima** (point to buy) where prices stop decreasing.
- Then find every **local maxima** (point to sell) where prices stop increasing.
- The profit for each transaction is (localMax - localMin), add all such profits.

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

📘 Example:
Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and 
sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.
*/

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int lMax = prices[0];
        int lMin = prices[0];
        int res = 0;
        
        int i = 0;
        while(i<n-1){
            
            while(i<n-1 && prices[i]>=prices[i+1]){i++;}
            lMin = prices[i];
            
            while(i<n-1 && prices[i] <= prices[i+1]){i++;}
            lMax = prices[i];
            
            res+=(lMax-lMin);
        }
        
        return res;
    }
}
