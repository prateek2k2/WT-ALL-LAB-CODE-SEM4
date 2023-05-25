import java.util.Random;

public class SortingAlgorithmComparison {
  public static void main(String[] args) {
    int n = 100000; // size of the array to sort
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];

    // generate random values for the arrays
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr1[i] = random.nextInt(100000);
      arr2[i] = arr1[i];
    }

    // measure the time it takes to sort the arrays using bubble sort
    long startTime = System.currentTimeMillis();
    bubbleSort(arr1);
    long endTime = System.currentTimeMillis();
    long bubbleSortTime = endTime - startTime;

    // measure the time it takes to sort the arrays using selection sort
    startTime = System.currentTimeMillis();
    selectionSort(arr2);
    endTime = System.currentTimeMillis();
    long selectionSortTime = endTime - startTime;

    // compare the execution time of the two sorting algorithms
    System.out.println("Bubble sort time: " + bubbleSortTime + " milliseconds");
    System.out.println("Selection sort time: " + selectionSortTime + " milliseconds");
  }

  private static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap arr[j] and arr[j + 1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  private static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // swap arr[i] and arr[minIndex]
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
}
