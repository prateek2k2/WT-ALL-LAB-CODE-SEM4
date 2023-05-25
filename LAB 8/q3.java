
/*Write a program to demonstrate the multiplication of two matrices. */
import java.util.Scanner;
public class q3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,col;
    System.out.println("Enter rows of first matrix:\n");
    row=sc.nextInt();
    System.out.println("Enter columns of first matrix:\n");
    col=sc.nextInt();
    int[][] a=new int[row][col];
    System.out.println("Enter values for 1st matrix:\n");
    int i,j;
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.println("Enter matrix values for line and position:\n"+i +j);
            a[i][j]=sc.nextInt();
        }
    }
    int row_2,col_2;
    System.out.println("Enter row of second matrix:\n");
    row_2=sc.nextInt();
    System.out.println("Enter columns of Second matrix:\n");
    col_2=sc.nextInt();
    if(col==row_2)
    {
    int[][] b=new int[row_2][col_2];
    System.out.println("Enter values for 2nd matrix:\n");
    for(i=0;i<row_2;i++){
        for(j=0;j<col_2;j++){
            System.out.println("Enter matrix values for line and position :\n"+i +j);
            b[i][j]=sc.nextInt();
        }
    }
    int[][] result=new int[row_2][col_2];
    /*for(i=0;i<row;i++){
        for(j=0;j<col_2;j++){
            result[i][j] = 0;
        }
    }
    */
    for (int m = 0; m < row; ++m){
        for (int n = 0; n < col_2; ++n){
            for (int k = 0; k < col; ++k){
                result[m][n] += a[m][k] * b[k][n];
            }
        }
   }
    System.out.println("\n");
    System.out.println("The 1st matrix is:\n");
    System.out.println("\n");
    for(i=0;i<row;i++){
        System.out.print("[");
        for(j=0;j<col;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.print("]\n");
    }

    System.out.println("\n");
    System.out.println("The 2nd matrix is:\n");
    System.out.println("\n");
    for(i=0;i<row_2;i++){
        System.out.print("[");
        for(j=0;j<col_2;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.print("]\n");
    }
    System.out.println("\n");
    System.out.println("\nThe product of matrices are:");
    System.out.println("\n");
    for(i=0;i<row;i++){
        System.out.print("[");
        for(j=0;j<col_2;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.print("]\n");
    }
}
else
{
    System.out.println("Matrix multipilcation not possible:");
}
}
}
