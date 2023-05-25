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
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the values in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Bubble Sort: ");
        sort ob = new sort();
        long start = System.nanoTime();
        BubbleSort.sort(arr);
        printArray(arr);
        long end = System.nanoTime();
        long execution=end-start;
        System.out.println("Execution time " + execution + "  Nano second");

        int[] arr2 = arr;
        System.out.println("Selection Sort: ");
        long start1 = System.nanoTime();
        SelectionSort.sort(arr2); 
        printArray(arr2);
        long end1 = System.nanoTime();
        long execution1=end1-start1;
        System.out.println("Execution time " + execution1 + "  Nano second");
        if(execution>execution1)
        System.out.print("Bubble sort takes more execution time i.e ." + (execution-execution1) + "nanosecond");
        else
        System.out.print("Selection sort takes more execution time.i.e ." + (execution1-execution) + "nanosecond");

    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
