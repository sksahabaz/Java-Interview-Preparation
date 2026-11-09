import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        // 1. LEFT: intervals that end before newInterval starts
        while (i < n && intervals[i][1] < newStart) {
            result.add(intervals[i]);
            i++;
        }

        // 2. MIDDLE: intervals that overlap, so merge them into newInterval
        while (i < n && intervals[i][0] <= newEnd) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd, intervals[i][1]);
            i++;
        }
        result.add(new int[]{newStart, newEnd});

        // 3. RIGHT: intervals that start after newInterval ends
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}