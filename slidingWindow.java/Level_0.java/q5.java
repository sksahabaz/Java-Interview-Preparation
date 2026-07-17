public class q5 {

    public static void slidingWindow(int[] arr, int k) {

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            // Window size becomes k
            if (right - left + 1 == k) {

                System.out.println(sum);

                // Remove left element
                sum -= arr[left];
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        slidingWindow(arr, k);
    }
}