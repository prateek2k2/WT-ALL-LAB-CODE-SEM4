import java.util.Scanner;

import java.util.Scanner;
public class q4 {
    public static void main(String args[])
    {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        l=sc.nextInt();
        b=sc.nextInt();
        rectangle ob= new rectangle();
        ob.perimeter(l, b);
        ob.area(l, b);
    }
    
}
class rectangle
{
    void perimeter(int l,int b)
    {
        int area;
        area=2*(l+b);
        System.out.println("Perimeter of the rectangle is:");
        System.out.println(area);
    }
    void area(int l,int b)
    {
        int area;
        area=l*b;
        System.out.println("Area of the rectangle is:");
        System.out.println(area);

    }

}
