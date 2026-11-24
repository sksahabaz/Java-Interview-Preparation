class Solution {
    public int countSubset(int[] arr, int k) {
        int n = arr.length, mid = n / 2;
        Map<Long, Integer> left = new HashMap<>();
        Map<Long, Integer> right = new HashMap<>();
        collect(arr, 0, mid, 0L, left);       // all subset sums of left half
        collect(arr, mid, n, 0L, right);      // all subset sums of right half

        long ans = 0;
        for (Map.Entry<Long, Integer> e : right.entrySet()) {
            long need = k - e.getKey();       // left part must give this
            ans += (long) e.getValue() * left.getOrDefault(need, 0);
        }
        return (int) ans;
    }

    // Subset Sums recursion: pick / skip, store each final sum in the map
    private void collect(int[] arr, int i, int end, long sum, Map<Long, Integer> map) {
        if (i == end) {
            map.merge(sum, 1, Integer::sum);  // count how many times this sum appears
            return;
        }
        collect(arr, i + 1, end, sum + arr[i], map);  // pick
        collect(arr, i + 1, end, sum, map);           // skip
    }
}