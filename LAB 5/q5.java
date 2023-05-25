import java.util.Scanner;
public class q5 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student");
        n=sc.nextInt();
        int[] roll=new int[n];
        String[] name=new String[n];
        float[] cgpa=new float[n];
        System.out.println("Enter detail name,roll,cgpa of student");
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
            roll[i]=sc.nextInt();
            cgpa[i]=sc.nextFloat();
        }
        System.out.println("Student details Name Roll Cgpa\t");
        for(int i=0;i<n;i++)
        {
            System.out.print(name[i] + roll[i] + cgpa[i]);
            System.out.println("");
        }
        int max=0;
        float temp=0;
        for(int i=0;i<n;i++)
        {
            if(temp<cgpa[i])
            {
                temp=cgpa[i];
                max=i;
            }
        }
        System.out.print("Lowest cgpa student detail");
        System.out.print(name[max] + roll[max] + cgpa[max] + "\t");

    }
    
}
