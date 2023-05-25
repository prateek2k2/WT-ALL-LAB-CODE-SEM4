import java.util.Scanner;

public class q2 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the arrays: ");
      int n = sc.nextInt();
      int[] arr1 = new int[n];
      int[] arr2 = new int[n];
      System.out.println("Enter the elements of the first array:");
      for (int i = 0; i < n; i++) {
         arr1[i] = sc.nextInt();
      }
      System.out.println("Enter the elements of the second array:");
      for (int i = 0; i < n; i++) {
         arr2[i] = sc.nextInt();
      }
      System.out.print("Enter the size of the result array: ");
      int m = sc.nextInt();
      int[] result = new int[m];
      
      try {
         for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
         }
         
         System.out.println("The sum of the arrays is:");
         for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
         }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
      }
   }
}
