import java.lang.reflect.Array;
public class Counting<T extends Number & Comparable<T>> implements SortMethod<T>{

    @Override
    public T[] sort(T[] A) {

        int[] count = new int[getMax(A,A.length).intValue() + 1];

        for (int i = 0; i < A.length; i++)
            count[A[i].intValue()]++;


        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        T[] output = (T[]) Array.newInstance(A.getClass().getComponentType(), A.length);//

        for (int i = A.length - 1; i >= 0; i--) {
            output[count[A[i].intValue()] - 1] = A[i];
            count[A[i].intValue()]--;
        }

        System.arraycopy(output, 0, A, 0, A.length);

        return output;
    }


    @Override
    public String getName(){
        return "Counting Sort";
    }

    private T getMax(T[] A, int size)
    {
        T max = A[0];
        for (int i = 1; i < size; i++) {
            if (A[i].compareTo(max) > 0) {
                max = A[i];
            }
        }
        return max;
    }
}