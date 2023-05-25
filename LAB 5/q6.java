import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("The area of the circle is: " + (Math.PI * radius * radius));
                break;
            case 2:
                System.out.println("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                System.out.println("The area of the square is: " + (sideLength * sideLength));
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println("The area of the triangle is: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
