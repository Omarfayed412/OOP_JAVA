public class QuickSort {
    //This method is the main recursive function that takes the list
    public static void quickSort(int[] list){
        quickSort(list, 0, list.length - 1);
    }
    //Overloaded method as a helper
    public static void quickSort(int[] list, int first, int last){
        if(last > first){
            //get the index of the pivot after partitioning
            int pivotIndex = partition(list, first, last);
            //quick sort the lower partition
            quickSort(list, first, pivotIndex - 1);
            //quick sort the higher partition
            quickSort(list, pivotIndex + 1, last);
        }
    }
    //Method for partition the list and returns the index of the pivot
    public static int partition(int[] list, int first, int last){
        int pivot = list[first]; //Set the first element as the pivot
        int low = first + 1; //the order of the first element in the new partition
        int high = last;

       while(high > low){
            //Forward search
            while(low <= high && list[low] <= pivot)
                low++;
            //Backward search
            while (low <= high && list[high] > pivot)
                high--;
            if(high > low) {
                swap(list , low , high);
            }
        }

        while(high > first && list[high] >= pivot)
            high--;
        //Swap pivot with the last element
        if (pivot > list[high]){
            swap(list , first , high);
            return high; //the index of the pivot
        }
        else{
            return first; //The index of the first element that we chose as pivot
        }
    }
    //This method swaps two elements within a list
    public static void swap(int[] array, int lower, int higher){
        int temp = array[higher];
        array[higher] = array[lower];
        array[lower] = temp;
    }
    public static void main(String[] args){
        int[] arr = {123, 35 , 4968 , 12 , 1, 987654, 324, 654, 45, 789, 455, 342, 178, 9865, 14, 78, 0, 376, 946, 35, 65, 471};
        quickSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}