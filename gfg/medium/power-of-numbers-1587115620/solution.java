class Solution {
    public int reverseExponentiation(int n) {
        int rev = reverse(n, 0);
        return power(n, rev);
    }

    // builds the reversed number in acc
    private int reverse(int n, int acc) {
        if (n == 0) return acc;                     // no digits left
        return reverse(n / 10, acc * 10 + n % 10);  // move last digit to acc
    }

    // fast power: n^p in O(log p)
    private int power(int n, int p) {
        if (p == 0) return 1;
        int half = power(n, p / 2);                 // compute ONCE
        if (p % 2 == 0) return half * half;
        return n * half * half;
    }
}