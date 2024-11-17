import java.util.Arrays;


public class HeapSort {

    public static void sort(int[] arr) {

        int size = arr.length;

        // convert the array into a abstract max heap tree
        for (int n = size / 2 - 1; n >= 0; n--) {

            heapify(arr, size, n);
        }
        //put max parent value in the last position of the array
        for (int n = size - 1; n >= 0; n--) {
            int temp = arr[n];
            arr[n] = arr[0];
            arr[0] = temp;

            //convert again a max heap tree
            heapify(arr, n, 0);
        }


    }

    private static void heapify(int[] arr, int size, int n) {

        int largest = n;
        int left = n * 2 + 1;
        int right = n * 2 + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != n) {
            int temp = arr[n];
            arr[n] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 48, 8, 105, 33, 1, 55, 78, 22};
        HeapSort.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }

}
