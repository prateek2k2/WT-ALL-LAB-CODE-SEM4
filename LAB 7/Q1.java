import java.util.Scanner;
abstract class search
{
    abstract void linear(int[] arr,int n,int k);
}
class linear_search extends search
{
    void linear(int[] arr,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                System.out.println("Element found at index "+ i+1 );
            }
        }
    }
}
class Q1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int k;
        k=sc.nextInt();
        linear_search ob=new linear_search();
        ob.linear(arr, n, k);

    }
}