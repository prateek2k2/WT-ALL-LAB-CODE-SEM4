import java.util.Scanner;
class perfect {
    boolean check(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) 
        {
            if (a % i == 0) 
            {
                sum =sum+i;
            }

        }
        return a == sum;

    }
}
class info {
    void show(String info) 
    {
        String p=info;
      System.out.println(p);
    }
  }


public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int num = sc.nextInt();
        perfect ob=new perfect();
        boolean result=ob.check(num);
        
        if (result) 
        {
            System.out.println(num + " is a perfect number.");
            System.out.println("Enter the info: ");
            String info = sc.nextLine();
            sc.nextLine();
            info s=new info();
            s.show(info);
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

}
