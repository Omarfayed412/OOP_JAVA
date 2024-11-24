public class Pancake<T extends Comparable<T>> implements SortMethod<T> {

    @Override
    public T[] sort(T[] array) {

        // Initially there is no sorted portion of the array
        int sorted_index = array.length;

        int max_index;

        while (sorted_index > 0) {

            max_index = get_max_index(array, sorted_index);

            // Check if the element is already in the correct place
            if (max_index != sorted_index - 1) {
                // First flip to get the largest element to index 0
                reverse_subarray(array, 0, max_index);
                // Second flip to get it to the end of the unsorted list
                reverse_subarray(array, 0, sorted_index - 1);
            }

            // The sorted portion at the end of the array grows by an element
            sorted_index--;
        }
        return array;
    }

    private void reverse_subarray(T[] array, int start, int end) {

        int len = end - start + 1;
        T temp;

        for (int i = 0; i < len / 2; i++) {
            swap(array, i + start, len - i - 1 + start);
        }
    }

    private int get_max_index(T[] array, int sorted_index) {
        /*
         * Returns the index of the maximum element of the array up until a certain index (exclusive)
         */

        int max_index = 0;

        for (int i = 0; i < sorted_index; i++) {
            if (array[i].compareTo(array[max_index]) > 0) {
                max_index = i;
            }
        }

        return max_index;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String getName(){
        return "Pancake Sort";
    }
}
