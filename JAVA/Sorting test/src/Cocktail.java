public class Cocktail<T extends Comparable<T>> implements SortMethod<T> {
    @Override
    public T[] sort(T[] A) {
        boolean swapped = true;
        int start = 0;
        int end = A.length - 1;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (A[i].compareTo(A[i + 1])>0) {
                    swap(A, i, i+1);
                    swapped = true;
                }
            }
             if (!swapped) {
                break;
            }
            swapped = false;
            end--;
             for (int i = end - 1; i >= start; i--) {
                if (A[i].compareTo(A[i + 1])>0) {
                   swap(A, i, i+1);
                    swapped = true;
                }
            }

            start++;
        }
        return A;  
    }
    
    public void swap(T[] A, int i, int j) {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    @Override
    public String getName() {
        return "Cocktail shaker";
    }
}
