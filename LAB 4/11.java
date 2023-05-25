import java.util.Scanner;


class ArmstrongNumber{ 
    static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == number;
    }
}

class SwapFirstAndLastDigit {
    static int swapFirstAndLastDigit(int number) {
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int lastDigit = number % 10;
        number /= 10;
        number = number % 10 + lastDigit * (int) Math.pow(10, (int) (Math.log10(number) + 1)) + firstDigit;
        return number;
    }
}

class 11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (ArmstrongNumber.isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
            System.out.println(
                    "Swapping the first and last digit: " + SwapFirstAndLastDigit.swapFirstAndLastDigit(number));
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}