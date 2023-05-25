import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

class merge {
    void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merg(arr, l, m, r);
        }
    }

    void merg(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
        }

    }

    void timetaken(int[] arr, int l, int r) {
        long startTime1 = System.nanoTime();

        mergesort(arr, 0, arr.length - 1);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Sorted  using  Merge Sort Algorithm: " + Arrays.toString(arr));
        System.out.println("Time taken  Merge Sort Algorithm: " + duration1 + " ns.");

    }
}

class Modifedmerge extends merge {
    void modifiedMergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m1 = l + (r - l) / 3;
            int m2 = l + 2 * (r - l) / 3;
            modifiedMergeSort(arr, l, m1);
            modifiedMergeSort(arr, m1 + 1, m2);
            modifiedMergeSort(arr, m2 + 1, r);
            merge(arr, l, m1, m2, r);
        }
    }

    void merge(int[] arr, int l, int m1, int m2, int r) {
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

    void timetaken(int[] arr, int l, int r) {
        super.timetaken(arr, l, r);
        long startTime2 = System.nanoTime();
        modifiedMergeSort(arr, 0, arr.length - 1);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Sorted  using Modified Merge Sort Algorithm: " + Arrays.toString(arr));
        System.out.println("Time taken using Modified Merge Sort Algorithm: " + duration2 + " ns.");
    }
}

class test {
    public static void main(String [] args) throws IOException
    {
        int[] arr;
        DataInputStream ds = new DataInputStream(System.in);
        System.out.print("Enter the number of integers: ");
        int n = Integer.parseInt(ds.readLine());
        arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(ds.readLine());
            arr[i] = x;
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        Modifedmerge obj = new Modifedmerge();
        obj.timetaken(arr, 0, arr.length - 1);

    }
}