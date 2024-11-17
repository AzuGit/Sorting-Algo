import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 48, 8, 105, 33, 1, 55, 78, 22};

        BubbleSort.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }
}