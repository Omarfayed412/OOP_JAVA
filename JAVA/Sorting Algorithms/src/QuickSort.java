public class QuickSort<T extends Comparable<T>> implements SortMethod<T> {

    @Override

    //This method is the main recursive function that takes the list
    public T[] sort(T[] array){
        sort(array, 0, array.length - 1);
        return array;
    }

    //Overloaded method as a helper
    public static void sort(T[] array, int first, int last){
        if(last > first){
            //get the index of the pivot after partitioning
            int pivotIndex = partition(array, first, last);
            //quick sort the lower partition
            quickSort(array, first, pivotIndex - 1);
            //quick sort the higher partition
            quickSort(array, pivotIndex + 1, last);
        }

    }

    //Method for partition the list and returns the index of the pivot
    private int partition(T[] array, int first, int last){
        int pivot = array[first]; //Set the first element as the pivot
        int low = first + 1; //the order of the first element in the new partition
        int high = last;

        while(high > low){

            //Forward search
            while(low <= high && array[low] <= pivot)
                low++;

            //Backward search
            while (low <= high && array[high] > pivot)
                high--;
            if(high > low) {
                swap(array , low , high);
            }
        }

        while(high > first && array[high] >= pivot)
            high--;

        //Swap pivot with the last element
        if (pivot > array[high]){
            swap(array , first , high);
            return high; //the index of the pivot
        }
        else{
            return first; //The index of the first element that we chose as pivot
        }
    }

    //This method swaps two elements within a list
    private void swap(T[] array, int lower, int higher){
        T temp = array[higher];
        array[higher] = array[lower];
        array[lower] = temp;
    }
    @Override

    public String getName(){

        return "Quick Sort";
    }
}