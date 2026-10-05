class Solution {
    public int search(int[] arr, int target) {
         int low = 0;
 
        // Right boundary of the current search range.
        int high = arr.length - 1;
 
        // Keep searching while a valid range still exists.
        while (low <= high) {
            // Calculate the middle index safely.
            int mid = low + (high - low) / 2;
 
            // The target is found at the middle position.
            if (arr[mid] == target) {
                return mid;
            }
 
            // Check whether the left half is normally sorted.
            if (arr[low] <= arr[mid]) {
                // The target lies inside the sorted left half.
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    // The target must lie in the other half.
                    low = mid + 1;
                }
            } else {
                // The left half is not sorted, so the right half must be sorted.
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    // The target must lie in the other half.
                    high = mid - 1;
                }
            }
        }
 
        return -1;
    }
    }
