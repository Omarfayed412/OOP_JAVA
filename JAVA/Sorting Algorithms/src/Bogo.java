import java.util.Random;

public class Bogo<T extends Comparable<T>> implements SortMethod<T> {

    private static final Random generator = new Random();
    @Override
    public T[] sort(T[] A) {
        while (isSorted(A) == false)
            shuffleRandom(A);
        return A;
    }

    @Override
    public String getName() {
        return "Bogo Sort";
    }


    //Generates random permutation of the array
    private void shuffleRandom(T[] A){
        for (int i = 1; i < A.length; i++) {
            int randomPosition = generator.nextInt(A.length);
            swap(A, i, randomPosition);
        }

    }

    void swap(T[] A, int i, int j)
    {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    boolean isSorted(T[] A)
    {
        for (int i = 1; i < A.length; i++)
            if (A[i].compareTo(A[i-1])<0)
                return false;
        return true;
    }


}
