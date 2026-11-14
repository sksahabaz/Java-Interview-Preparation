
class Solution {

    static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long power(long base, long exp) {

        // Base case
        if (exp == 0) {
            return 1;
        }

        // Recursive call
        long half = power(base, exp / 2);

        // Combine smaller results
        long result = (half * half) % MOD;

        // Handle odd exponent
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}
