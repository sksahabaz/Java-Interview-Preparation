public class q3 {

    public static void main(String[] args) {

        int arr[] = {2, -1, 5, -1, 7, 9};

        int temp[] = new int[arr.length];
        int index = 0;

        // Store non -1 elementss
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Store -1 elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}