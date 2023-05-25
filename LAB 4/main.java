import java.util.Scanner;
import java.lang.Math;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:");
    int num = sc.nextInt();
    ArmstrongCheck ob = new ArmstrongCheck();
    int result = ob.checkArmstrong(num);
    SwapDigits obj = new SwapDigits();
    if (result == num) {
      System.out.println(num + " Is an Armstrong number.");
      System.out.println("After swapping the digits" );
      int num1=obj.swap(num);
      System.out.println(num1);
    } 
    else 
    {
      System.out.println(num + " Is not an Armstrong number.");
    }
  }
}

class ArmstrongCheck {
  int checkArmstrong(int num) {
    int originalNum = num;
    int result = 0;
    int n = 0;
    while (originalNum != 0) {
      originalNum /= 10;
      ++n;
    }
    originalNum = num;
    while (originalNum != 0) {
      int remainder = originalNum % 10;
      result += Math.pow(remainder, n);
      originalNum /= 10;
    }
    return result;
  }
}

class SwapDigits 
{
  int swap(int num) 
  {
    int lastDigit = num % 10;
    int numOfDigits = (int) Math.log10(num) + 1;
    int firstDigit = (int) (num / Math.pow(10,( numOfDigits - 1)));
    num = (int) (num - firstDigit * Math.pow(10, numOfDigits - 1) + lastDigit * Math.pow(10, numOfDigits - 1) - lastDigit);
    return ((num + lastDigit) * (int)(Math.pow(10, numOfDigits - 1)) - (firstDigit * (int)(Math.pow(10, numOfDigits - 1)))+firstDigit);
  }
}
