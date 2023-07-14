import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int rotationCount) {
        int length = arr.length;
        rotationCount %= length; // Ensure rotationCount is within the array length

        // Reverse the entire array
        reverseArray(arr, 0, length - 1);

        // Reverse the first rotationCount elements
        reverseArray(arr, 0, rotationCount - 1);

        // Reverse the remaining elements
        reverseArray(arr, rotationCount, length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;

        rotateArray(arr, rotationCount);

        System.out.println(Arrays.toString(arr));
    }
}
