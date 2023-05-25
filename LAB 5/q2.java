//import java.util.Scanner;
public class q2 
{
    public static void main(String[] args)
    {
        q2 ob=new q2(5, 4);
        q2 ob1=new q2(5.0, 4.0);
        q2 ob2=new q2(5.0f, 4.0f);
    }
q2(int a,int b)
{
    int c=a-b;
    System.out.println("Int ");
    System.out.println(c);
}
q2(double a,double b)
{
    double c=a-b;
    System.out.println("Double ");
    System.out.println(c);
}
q2(float a,float b)
{
    float c=a-b;
    System.out.println("Float ");
    System.out.println(c);
}
}