import java.util.Random;

public class SortDriver {
    public static void main(String[] args){
        runSort(new Selection<>(),1000);
        runSort(new Bubble<>(),1000);
        runSort(new Heap<>(),5000);
        runSort(new Pancake<>(),5000);
        runSort(new Counting<>(),8000);
        runSort(new Bogo<>(),10);
        runSort(new Cocktail<>(),1000);
        runSort(new Timsort<>(), 5000);
        runSort(new QuickSort<>(), 5000);
    }

    private static void runSort(SortMethod<Integer> sorter, int arraySize) {
        Integer[] A = initRandArray(arraySize, 0, 100);
        showBefore(A);
        sortApproachMessage(sorter.getName());
        long startTime = System.currentTimeMillis();
        A = sorter.sort(A);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        showAfter(A, timeElapsed);
    }

    private static void sortApproachMessage(String method) {
        System.out.println("Sorting using " + method + "...");
    }

    private static void showAfter(Integer[] a, long runtime) {
        System.out.print("Sorted Array :");
        printArray(a);
        System.out.println("Sorted " + a.length + " items in : " + runtime + " ms");
        System.out.println("______________________________________________________________");
    }

    private static void showBefore(Integer[] a) {
        System.out.print("Array Before Sorting :");
        printArray(a);
    }

    private static void printArray(Integer[] a) {
        for (Integer i : a)
            System.out.print(i + "  ");
        System.out.println();
    }

    public static Integer[] initRandArray(Integer n, Integer min, Integer max) {
        Integer[] A = new Integer[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(max - min) + min;
        }
        return A;
    }
}
