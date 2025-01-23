public class BubbleSort {
    /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param a The array to be sorted. It contains elements that implement the Comparable interface.
     *          This allows the method to sort any type of objects that can be compared (e.g., Integers, Strings).
     *
     * Hint: Remember to break the loop if no elements are swapped during a pass.
     *       This optimization ensures the algorithm stops early if the array is already sorted.
     */
    public void sort (Comparable[] a){
        int n = a.length;
        boolean swapped;

        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            // If no elements were swapped during this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    /**
     * Swaps two elements in the given array.
     *
     * @param a The array in which the elements are to be swapped.
     * @param j The index of the first element to swap.
     * @param i The index of the second element to swap.
     */
    private void swap(Object[] a, int j, int i) {
        Object temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
