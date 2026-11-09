class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;
        int lastEnd = intervals[0][1];          // end of last KEPT interval

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];          // end of CURRENT interval

            if (start >= lastEnd) {
                lastEnd = end;                  // keep it, room free later now
            } else {
                removed++;                      // clash, remove it
            }
        }
        return removed;
    }
}