public class Heap <T extends Comparable<T>> implements SortMethod<T>{
    public T[] sort(T[] A)
    {
        int n = A.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(A, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            Swap(A,0,i);

            // call max heapify on the reduced heap
            heapify(A, i, 0);
        }
        return A;
    }

    private void heapify(T [] arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l].compareTo(arr[largest])>0 )
            largest = l;

        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;

        if (largest != i)
        {
            Swap(arr,i,largest);

            heapify(arr, n, largest);
        }
    }
    private void Swap(T[] a,int x,int y)
    {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;

    }
    @Override
    public String getName(){
        return "Heap Sort";
    }

}
