class Solution {
    public int josephus(int n, int k) {
        return solve(n, k) + 1;              
    }

    private int solve(int n, int k) {
        if (n == 1) return 0;               
        return (solve(n - 1, k) + k) % n;   
    }
}