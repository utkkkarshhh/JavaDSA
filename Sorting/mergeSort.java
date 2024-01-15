import java.util.ArrayList;

public class mergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        ArrayList<Integer> merged = new ArrayList<>();

        int i = left; 
        int j = middle + 1; 

        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                merged.add(arr[i]);
                i++;
            } else {
                merged.add(arr[j]);
                j++;
            }
        }

        while (i <= middle) {
            merged.add(arr[i]);
            i++;
        }

        while (j <= right) {
            merged.add(arr[j]);
            j++;
        }

        for (int k = 0; k < merged.size(); k++) {
            arr[left + k] = merged.get(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 60, 50, 20, 30, 40};
        System.out.println("Unsorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
