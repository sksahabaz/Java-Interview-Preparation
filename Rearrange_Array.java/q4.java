public class q4 {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 4};

        int temp[] = new int[arr.length];
        int index = 0;

        // Store zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Store non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}