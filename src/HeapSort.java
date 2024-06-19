public class HeapSort<T extends Comparable<T>> {

    //Method for generic heapsort
    public void heapSort(T[] array, int n) {
        // Create first heap
        for (int rootIndex = n / 2 - 1; rootIndex >= 0; rootIndex--)
            reheap(array, rootIndex, n - 1);
        swap(array, 0, n - 1);

        for (int lastIndex = n - 2; lastIndex > 0; lastIndex--) {
            reheap(array, 0, lastIndex);
            swap(array, 0, lastIndex);
        } //end for
    } //end heapsort

    //Reheap generic heapsort method
    private void reheap(T[] heap, int rootIndex, int lastIndex) {
        boolean done = false;
        T orphan = heap[rootIndex];
        int leftChildIndex = 2 * rootIndex + 1;

        while (!done && (leftChildIndex <= lastIndex)) {
            int largerChildIndex = leftChildIndex;
            int rightChildIndex = leftChildIndex + 1;
            if ((rightChildIndex <= lastIndex) && heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0) {
                largerChildIndex = rightChildIndex;
            } //end if

            if (orphan.compareTo(heap[largerChildIndex]) < 0) {
                heap[rootIndex] = heap[largerChildIndex];
                rootIndex = largerChildIndex;
                leftChildIndex = 2 * rootIndex + 1;
            } else {
                done = true;
            }
        } //end while
        heap[rootIndex] = orphan;
    } //end reheap
    //-------------------------------------------------------------------------------------
    // Swap generic heapsort method
    private void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } //end swap
} //end SortArray
