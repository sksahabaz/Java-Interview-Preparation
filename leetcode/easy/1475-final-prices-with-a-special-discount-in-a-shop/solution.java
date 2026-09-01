class Solution {
    public int[] finalPrices(int[] prices) {
       int n = prices.length;
       int ans[] = new int[n];
       Stack<Integer> stack = new Stack<>();
       for(int i = n-1 ;i>=0;i--){
        while(!stack.isEmpty() && prices[stack.peek()]> prices[i]){
            stack.pop();
        }
        ans[i] = stack.isEmpty() ? prices[i] : prices[i] - prices[stack.peek()];
       stack.push(i);
       }
       return ans;
    }
}