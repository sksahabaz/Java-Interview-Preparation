class Solution {
    static final long MOD = 1000000007;

    static long sequence(int n) {
        return solve(1, 1, n);
    }

    // sum of terms i..n, where term i starts at 'start'
    static long solve(int i, long start, int n) {
        if (i > n) return 0;                          // no terms left
        long term = product(start, i);                // this term
        long rest = solve(i + 1, start + i, n);       // remaining terms
        return (term + rest) % MOD;
    }

    // multiply 'count' consecutive numbers starting at 'start'
    static long product(long start, int count) {
        if (count == 0) return 1;
        return (start % MOD) * product(start + 1, count - 1) % MOD;
    }
}