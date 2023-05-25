/*1. Illustrate the usage of abstract class with following Java classes –
i>An abstract class “Student‟ with data member roll no, reg no and a abstract method course()
ii>A subclass “Kiitian” with course() method implementation
 */
import java.util.Scanner;
abstract class Student
{
    int roll=2010,reg_no=999;
    abstract void course();
}
class KIitian extends Student
{
    public void course()
    {
        System.out.println("Roll Number:"+roll);
        System.out.println("Reg Number:"+reg_no);
    }
}
class q1
{
    public static void main(String args[])
    {
        KIitian ob=new KIitian();
        ob.course();
    }
}