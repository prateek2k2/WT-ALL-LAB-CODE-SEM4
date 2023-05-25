import java.util.Scanner;

class BubbleSort {

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort {

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}

public class sort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Bubble Sort: ");
        // BubbleSort ob=new BubbleSort();
        sort ob = new sort();
        long start = System.nanoTime();
        BubbleSort.sort(arr);
        printArray(arr);
        long end = System.nanoTime();
        long execution=end-start;
        System.out.println("Execution time " + execution + "  Nano second");

        int[] arr2 = { 64, 25, 12, 22, 11 };
        System.out.println("Selection Sort: ");
        // SelectionSort ob1=new SelectionSort();
        long start1 = System.nanoTime();
        SelectionSort.sort(arr2); 
        printArray(arr2);
        long end1 = System.nanoTime();
        long execution1=end1-start1;
        System.out.println("Execution time " + execution1 + "  Nano second");
        if(execution>execution1)
        System.out.print("Bubble sort takes more execution time.");
        else
        System.out.print("Selection sort takes more execution time.");

    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
