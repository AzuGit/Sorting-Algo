import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        int size = arr.length;
        int low = 0;
        int high = size - 1;

        divideAndSort(arr, low, high);

    }

    private static void divideAndSort(int[] arr, int low, int high) {

        if (low < high) {
            //find de partition value
            int pValue = partition(arr, low, high);
            // then divide and sort using pivot
            divideAndSort(arr, low, pValue - 1);
            divideAndSort(arr, pValue + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        //choose a pivot value
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 6, 48, 8, 105, 33, 1, 55, 78, 22};

        QuickSort.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}
