import java.util.Scanner;

class area
{
    
    area(double b,double h)
    {
        double areaf=0.5*b*h;
        System.out.println("Area of Triangle :"+areaf);
    }
    area(double r)
    {
        double areac=3.14*r*r;
        System.out.println("Area of Circle :"+areac);
    }
    area(int a)
    {
        double areas=a*a;
        System.out.println("Area of square :"+areas);
    }
}
public  class q3 {
 public static void main (String args[]) {
   //area obj=new area();
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1 For Triangle: ");
     System.out.println("Enter 2 For Circle: ");
     System.out.println("Enter 3 For Square: ");
     n=sc.nextInt();
     if(n==1)
     {
         double b,h;
         System.out.println("Enter base and height: ");
         b= sc.nextDouble();
         h=sc.nextDouble();
         area ob=new area(b,h);
     }
     else if(n==2)
     {
         double r;
         System.out.println("Enter Radius: ");
         r=sc.nextDouble();
         area ob=new area(r);
     }
     else if(n==3)
     {
         int a;
         System.out.println("Enter side");
         a=sc.nextInt();
         area ob=new area(a);
     }
     else{
         System.out.println("Choose correct option");
     }
 }
}