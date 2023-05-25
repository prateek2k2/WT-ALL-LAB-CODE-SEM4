import java.util.*;
import java.io.*;
class armstrong
{
    public static void main(String args[])
    {
        int a=1634;
        int x=a;
        int d,r=0;
        //int l=(int)(Math.log10(a)+1);
        while(a!=0)
        {
            d=a%10;
            r=r+(d^4);
            a=a/10;
        }
        if(r==x)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}