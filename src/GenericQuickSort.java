public class GenericQuickSort<T extends Comparable<T>> {  //generic object
    public void quickSort(T[] list) {                       //generic object
        quickSort(list, 0, list.length - 1);
    }
    private void quickSort(T[] list, int first, int last) { //generic object
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    /** Partition the array list[first..last] */
    private int partition(T[] list, int first, int last) {  //generic object
        T pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search


        while (high > low) {
            // Search forward from left
            while (low <= high && list[low].compareTo(pivot) <= 0)  //method compares two pivots
                low++;


            // Search backward from right
            while (low <= high && list[high].compareTo(pivot) > 0)  //method compares two pivots
                high--;


            // Swap two elements in the array
            if (high > low) {
                T temp = list[high];    //generic object
                list[high] = list[low];
                list[low] = temp;
            }
        }


        while (high > first && list[high].compareTo(pivot) >= 0)    //method compares two pivots
            high--;


        // Swap pivot with array[high]
        if (pivot.compareTo(list[high]) > 0) {  //method compares two pivots
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}
