
//WAP TO FIND A/B USING TRY CATCH EXCPETION HANDLING
import java.util.*;

class q1 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
         c= a / b;
         System.out.println("The quotient of a and b is: " + c);
      } 
      catch (ArithmeticException e) 
      {
         System.out.println(e.getMessage());
      }
        
    }
}