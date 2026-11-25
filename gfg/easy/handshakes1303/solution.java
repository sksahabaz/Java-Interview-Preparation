class Solution {
    int[] memo = new int[31];                       

    public int count(int n) {
        if (n == 0) return 1;                      
        if (memo[n] != 0) return memo[n];         
        int total = 0;
        for (int i = 0; i <= n - 2; i += 2) {      
            total += count(i) * count(n - 2 - i);   
        }
        return memo[n] = total;
    }
}