import java.util.*;
public class q4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        try {
            for (int i = 0; i < n; i++) 
            {
                arr1[i]=sc.nextInt();
            }
            System.out.println(arr1[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: The size of the result array is too small out of bound.");
        }
    }
    
}
