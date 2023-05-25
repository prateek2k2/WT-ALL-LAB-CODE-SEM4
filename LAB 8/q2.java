
import java.util.Scanner;

class Course {
    int credit;
    String medium;
    int NumStudents;

    Course(int c, String m, int Num) 
    {
        credit = c;
        medium = m;
        NumStudents = Num;
    }

    public void display() 
    {
        if (NumStudents <= 2) 
        {
            System.out.println("Course floated");
        }
        else 
        {
            System.out.println("Course not floated");
        }
    }

    public int number() 
    {
        return NumStudents;
    }
}

class CourseA extends Course 
{
    public CourseA(int credit, String medium, int NumStudents) 
    {
        super(credit, medium, NumStudents);
    }
}

class CourseB extends Course 
{
    public CourseB(int credit, String medium, int NumStudents) 
    {
        super(credit, medium, NumStudents);
    }
}

public class q2 {
    public static void main(String[] args) 
    {
        int c,c1;
        String m,m1;
        int min,min1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the credit:");
        c=sc.nextInt();
        System.out.println("Enter the Medium");
        m=sc.next();
        System.out.println("Enter the number of student");
        min=sc.nextInt();
        CourseA courseA = new CourseA(c, m, min);
        courseA.display();
        int x=courseA.number();
        System.out.println("Number of student is:"+x);
        System.out.println("Enter the credit:");
        c1=sc.nextInt();
        System.out.println("Enter the Medium");
        m1=sc.next();
        System.out.println("Enter the number of student");
        min1=sc.nextInt();
        CourseB courseB = new CourseB(c1, m1, min1);
        courseB.display();
        int y=courseB.number();
        System.out.println("Number of student is:"+y);

    }
}
