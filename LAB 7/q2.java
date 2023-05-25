import java.util.Scanner;

interface search 
{
    int binary(int[] arr, int l, int h, int k);
}

class binary_search implements search {
    public int binary(int[] arr, int l, int h, int k) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k)
                l = mid + 1;
            else {
                h = mid - 1;
            }
        }
        return -1;
    }
}

class modified_binary_search implements search {
   public int binary(int[] arr, int l, int h, int k) {
        while (l <= h) {
            int mid = l + 2;
            if (mid > l)
                mid = l;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k)
                l = mid + 1;
            else {
                h = mid - 1;
            }
        }
        return -1;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k;
        k = sc.nextInt();
        binary_search ob = new binary_search();
        modified_binary_search obj = new modified_binary_search();
        long start = System.nanoTime();
        int x = ob.binary(arr, 0, n - 1, k);
        long end = System.nanoTime();
        if (x != -1) {
            System.out.println("Element found at index " + x);
        } else {
            System.out.println("Value not found");
        }
        long start1 = System.nanoTime();
        int y = obj.binary(arr, 0, n - 1, k);
        long end1 = System.nanoTime();
        if (y != -1) {
            System.out.println("modified search Element found at index " + y);
        } else
            System.out.println("Value not found");
        System.out.println("Execution time of binary search=" + (end - start));
        System.out.println("Execution time of modified binary search=" + (end1 - start1));

    }

}
