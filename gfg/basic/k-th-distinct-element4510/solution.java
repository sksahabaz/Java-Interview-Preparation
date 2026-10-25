class Solution {
    public int kthDistinct(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                k--;

                if (k == 0) {
                    return num;
                }
            }
        }

        return -1;
    }
}