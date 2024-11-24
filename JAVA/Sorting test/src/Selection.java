public class Selection<T extends Comparable<T>> implements SortMethod<T> {
    @Override
    public T[] sort(T[] A) {
        int size = A.length;
        for (int i = 0; i < size - 1; i++) {
            int mid = i;
            for (int j = i + 1; j < size; j++)
                if (A[j].compareTo(A[mid]) < 0)
                    mid = j;
            if (mid != i)
                swap(A,i,mid);
        }
        return A;
    }

    @Override
    public String getName() {
        return "Selection Sort";
    }


    private void swap(T[] A, int i, int mid) {
        T temp = A[i];
        A[i] = A[mid];
        A[mid] = temp;
    }
}
