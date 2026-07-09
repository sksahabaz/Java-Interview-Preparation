
//Given an integer array, move all -1 values to the
// beginning of the array while maintaining the order of the remaining elements.



public class q1 {

    public static void main(String[] args) {

        int arr[] = {2, -1, 5, -1, 7, 9};

        int temp[] = new int[arr.length];
        int index = 0;

        // Store all -1 first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Store remaining elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Print result
        for (int num : temp) {
            System.out.print(num + " ");
        }
    }
}