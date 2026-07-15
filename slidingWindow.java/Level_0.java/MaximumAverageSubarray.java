public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double maxAverage = (double) sum / k;

        for (int i = k; i < arr.length; i++) {

            sum -= arr[i - k];
            sum += arr[i];

            double average = (double) sum / k;

            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        System.out.println(maxAverage);
    }
}