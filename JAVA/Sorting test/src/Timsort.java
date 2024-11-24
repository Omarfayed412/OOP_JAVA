import java.util.ArrayList;
import java.util.Arrays;

public class Timsort<T extends Comparable<T>> implements SortMethod<T> {
    @Override
    public T[] sort(T[] A) {
        return timSort(A, 0, A.length - 1);
    }

    public T[] insertionsort(T[] A, int start, int end) {
        for (int i = start; i < end; i++) {
            int mid = i;
            for (int j = i + 1; j < end + 1; j++)
                if (A[j].compareTo(A[mid]) < 0)
                    mid = j;
            if (mid != i)
                swap(A, i, mid);
        }
        return A;
    }

    @Override
    public String getName() {
        return "TimSort";
    }

    private void swap(T[] A, int i, int mid) {
        T temp = A[i];
        A[i] = A[mid];
        A[mid] = temp;
    }

    private T[] timSort(T[] array, int start, int end) {
        // base case
        if (end - start > 32) {
            // find the middle point
            int middle = (start + end) / 2;

            timSort(array, start, middle); // sort first half
            timSort(array, middle + 1, end); // sort second half

            // merge the sorted halves
            return merge(array, start, middle, end);
        } else {
            return insertionsort(array, start, end);
        }
    }

    private T[] merge(T[] array, int start, int middle, int end) {
        T[] leftArray = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

        /* Merge the temp arrays */

        // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        // compare each index of the subarrays adding the lowest value to the
        // currentIndex
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // copy remaining elements of leftArray[] if any
        while (leftIndex < leftArray.length)
            array[currentIndex++] = leftArray[leftIndex++];

        // copy remaining elements of rightArray[] if any
        while (rightIndex < rightArray.length)
            array[currentIndex++] = rightArray[rightIndex++];
        return array;
    }
}
