public class ShellSort<T extends Comparable<T>> { // class uses generics now; allows objects of            type T to be compared
    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    public void shellSort(T[] array, int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                T temp = array[i]; // made temp variable of type T; allows the program to an array of type ‘T[]’ instead of ‘int[]’
                int j;
                for (j = i; j >= interval && array[j - interval].compareTo(temp) > 0; j -= interval) {
                    array[j] = array[j - interval]; //uses compareTo method of the comparable interface for comparison
                }
                array[j] = temp;
            }
        }
    }
}