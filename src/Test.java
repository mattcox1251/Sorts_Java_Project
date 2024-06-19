import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Test sorting with Tv objects
        Tv[] tvArray = {
                new Tv("Breaking Bad", 10.59, 52, "Drama"),
                new Tv("Walking Dead", 12.00, 43, "drama"),
                new Tv("Modern Family", 19.99, 27, "Sitcom"),
        };

        // Objects are sorted based on their avg minutes

        // Sort using heap sort
        System.out.println("\nHeap Sort:");
        System.out.println("Unsorted array:" + Arrays.toString(tvArray));
        Tv[] heapSortedArray = Arrays.copyOf(tvArray, tvArray.length);
        new HeapSort<Tv>().heapSort(heapSortedArray, heapSortedArray.length);
        printArray(heapSortedArray);
        verifySort(heapSortedArray);

        // Sort using shell sort
        System.out.println("\nShell Sort:");
        System.out.println("Unsorted array:" + Arrays.toString(tvArray));
        Tv[] shellSortedArray = Arrays.copyOf(tvArray, tvArray.length);
        new ShellSort<Tv>().shellSort(shellSortedArray, shellSortedArray.length);
        printArray(shellSortedArray);
        verifySort(shellSortedArray);

        // Sort using merge sort
        System.out.println("\nMerge Sort:");
        System.out.println("Unsorted array:" + Arrays.toString(tvArray));
        Tv[] mergeSortedArray = Arrays.copyOf(tvArray, tvArray.length);
        new MergeSort<Tv>().mergeSort(mergeSortedArray);
        printArray(mergeSortedArray);
        verifySort(mergeSortedArray);

        // Sort using quick sort
        System.out.println("\nQuick Sort:");
        System.out.println("Unsorted array:" + Arrays.toString(tvArray));
        Tv[] quickSortedArray = Arrays.copyOf(tvArray, tvArray.length);
        new GenericQuickSort<Tv>().quickSort(quickSortedArray);
        printArray(quickSortedArray);
        verifySort(quickSortedArray);
    }

    private static <T extends Comparable<T>> void printArray(T[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static <T extends Comparable<T>> void verifySort(T[] array) {
        // Verify sorting
        if (isSorted(array)) {
            System.out.println("Verification: The array is sorted.\n");
        } else {
            System.out.println("Verification: The array is not sorted.\n");
        }
    }

    private static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].compareTo(array[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
