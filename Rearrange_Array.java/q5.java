public class Q5 {

    public static void main(String[] args) {

        int arr[] = {-2, 5, -1, 4, 8, -3};

        int temp[] = new int[arr.length];
        int index = 0;

        // Store positive numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Store negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}