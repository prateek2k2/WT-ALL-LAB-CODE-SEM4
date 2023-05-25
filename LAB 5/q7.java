import java.util.Scanner;

public class q7 {
    int[] num;
    int n;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        n = sc.nextInt();

        num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            num[i] = sc.nextInt();
        }

        sc.close();
    }

    public void swap() {
        if (n < 2) {
            return;
        }

        int min = 0;
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (num[i] < num[min]) {
                min = i;
            }

            if (num[i] > num[max]) {
                max = i;
            }
        }
        int temp = num[min];
        num[min] = num[max];
        num[max] = temp;
    }

    public void display() {
        System.out.print("Resulting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println()
    }

    public static void main(String[] args) {
        q7 number = new q7();
        number.read();
        number.swap();
        number.display();
    }
}