import java.util.Scanner;

class sort {
    void merge(int[] arr, int start, int mid, int end) {
        int leftLength = mid - start + 1;
        int rightLength = end - mid;
        int[] leftArr = new int[leftLength];
        int[] rightArr = new int[rightLength];
        for (int i = 0; i < leftLength; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int j = 0; j < rightLength; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = start;
        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    void modifiedMergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int oneThird = start + (end - start) / 3;
            int twoThird = start + 2 * (end - start) / 3;
            modifiedMergeSort(arr, start, oneThird);
            modifiedMergeSort(arr, oneThird + 1, twoThird);
            modifiedMergeSort(arr, twoThird + 1, end);
            merge1(arr, start, oneThird, twoThird, end);
        }
    }

    void merge1(int[] arr, int l, int m1, int m2, int r) {
        int n1 = m1 - l + 1;
        int n2 = m2 - m1;
        int n3 = r - m2;
        int[] L = new int[n1];
        int[] M = new int[n2];
        int[] R = new int[n3];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[m1 + 1 + j];
        }
        for (int k = 0; k < n3; k++) {
            R[k] = arr[m2 + 1 + k];
        }
        int i = 0, j = 0, k = 0, p = l;
        while (i < n1 && j < n2 && k < n3) {
            if (L[i] <= M[j] && L[i] <= R[k]) {
                arr[p++] = L[i++];
            } else if (M[j] <= L[i] && M[j] <= R[k]) {
                arr[p++] = M[j++];
            } else {
                arr[p++] = R[k++];
            }
        }
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[p++] = L[i++];
            } else {
                arr[p++] = M[j++];
            }
        }
        while (j < n2 && k < n3) {
            if (M[j] <= R[k]) {
                arr[p++] = M[j++];
            } else {
                arr[p++] = R[k++];
            }
        }
        while (i < n1 && k < n3) {
            if (L[i] <= R[k]) {
                arr[p++] = L[i++];
            } else {
                arr[p++] = R[k++];
            }
        }
        while (i < n1) {
            arr[p++] = L[i++];
        }
        while (j < n2) {
            arr[p++] = M[j++];
        }
        while (k < n3) {
            arr[p++] = R[k++];
        }
    }
}

class Q1 {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        sort ob = new sort();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        long start = System.nanoTime();
        ob.mergesort(arr, 0, n - 1);
        long end = System.nanoTime();
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" Modified Sorted Array: ");
        long start1 = System.nanoTime();
        ob.modifiedMergeSort(arr, 0, n - 1);
        long end1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Time complexity " + (end - start) + "ms");
        System.out.println("Time complexity modified merge sort " + (end1 - start1) + "ms");
    }

}