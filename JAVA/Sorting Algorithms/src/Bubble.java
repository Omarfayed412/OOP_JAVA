public class Bubble<T extends Comparable<T>> implements SortMethod<T> {
    @Override
    public T[] sort(T[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (A[j].compareTo(A[j + 1])>0) {
                    swap(A, j, j+1);
                }
        return A;
    }
    private void swap(T[] A, int i, int j) {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    @Override
    public String getName(){
        return "Bubble Sort";
    }
}