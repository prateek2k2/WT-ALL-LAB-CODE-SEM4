import java.util.Scanner;
interface area
{
    void circle(float r);
}
interface area1
{
    void rectangle(int l,int b);
}
class area2
{
    void tri(int b,int h,int a1,int a2,int a3)
    {
        if((a1+a2+a3)==180)
        {
            float ar = (b*h)/2;
            System.out.println("ARea of triagnle is:" + ar);
        }
        else
        {
            System.out.println("Triangle not possible");
        }
    }
}
class final1 extends area2 implements area,area1
{
    public void circle(float r)
    {
        float ar;
        ar=(22/7)*r*r;
        System.out.println("Area of circle is" + ar);
    }
    public void rectangle(int l,int b)
    {
        int ar;
        ar=l*b;
        System.out.println("Area of rectangle" + ar);
    }
   /* public void tri(int b,int h,int a1,int a2,int a3)
    {
        if((a1+a2+a3)==180)
        {
            float ar = (b*h)/2;
            System.out.println("ARea of triagnle is:" + ar);
        }
        else
        {
            System.out.println("Triangle not possible");
        }
    }*/
}
public class q12 {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int b,h,l,br,a1,a2,a3;
        float r;
        System.out.println("Enter the radius:");
        r=sc.nextFloat();
        System.out.println("Enter the length and width:");
        l=sc.nextInt();
        br=sc.nextInt();
        System.out.println("Height and breadth of triangle:");
        h=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter three angles of triangle:");
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        final1 ob=new final1();
        ob.circle(r);
        ob.rectangle(l, br);
        ob.tri(b, h, a1, a2, a3);
    }
    
}
