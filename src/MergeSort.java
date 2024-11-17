import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {

        //position index to divide the array
        int size = arr.length;
        int left = 0;
        int right = size - 1;


        divideArr(arr, left, right);

    }

    private static void divideArr(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            divideArr(arr, left, mid);
            divideArr(arr, mid + 1, right);
            //after divide, run merging
            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        //arrays size
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        //copy values from arr to auxiliary arrays

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        // compare and fill final sort array

        int x = 0;
        int j = 0;
        int z = left;

        while (x < n1 && j < n2) {

            if (leftArr[x] <= rightArr[j]) {
                arr[z] = leftArr[x];
                x++;
            } else {
                arr[z] = rightArr[j];
                j++;
            }
            z++;
        }

        while (x < n1){
            arr[z] = leftArr[x];
            x++;
            z++;
        }
        while (j < n2){
            arr[z] = rightArr[j];
            j++;
            z++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 15, 48, 82, 105, 33, 1, 55, 78, 22};
        MergeSort.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }
}
