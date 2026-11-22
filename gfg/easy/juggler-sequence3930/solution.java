class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> list = new ArrayList<>();
        solve(n, list);
        return list;
    }

    static void solve(long n, List<Long> list) {
        list.add(n);                         // add current term
        if (n == 1) return;                  // base case

        long next;
        if (n % 2 == 0) {
            next = (long) Math.sqrt(n);      // even → floor(√n)
        } else {
            next = (long) Math.pow(n, 1.5);  // odd → floor(n^1.5)
        }
        solve(next, list);                   // rest of the sequence
    }
}