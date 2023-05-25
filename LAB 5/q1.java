import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length,width,height");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Box box = new Box(length, width, height);

        System.out.println("Volume of the box is: " + box.volume());
    }
}

class Box {
  double length1;
  double width1;
  double height1;

  public Box(double length, double width, double height) {
      length1 = length;
      width1 = width;
      height1= height;
  }

  public double volume() {
      return length1 * width1 * height1;
  }
}