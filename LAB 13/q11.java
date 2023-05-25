import java.util.Scanner;

abstract class Staff {
    private String name;
    private String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void displayDetails();
}

class FullTimeStaff extends Staff {
    private String department;
    private double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeStaff extends Staff {
    private double hours;
    private double rate;

    public PartTimeStaff(String name, String address, double hours, double rate) {
        super(name, address);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
    }
}

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Full Time\n 2 For Part Time ");
        int m=sc.nextInt();
        if(m==1)
        {
        System.out.print("Enter full-time staff name: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter full-time staff address: ");
        String address = sc.nextLine();
        System.out.print("Enter full-time staff department: ");
        String department = sc.nextLine();
        System.out.print("Enter full-time staff salary: ");
        double salary = sc.nextDouble();

        FullTimeStaff fullTimeStaff = new FullTimeStaff(name, address, department, salary);
        fullTimeStaff.displayDetails();
        }
        else if(m==2)
        {

        System.out.print("Enter part-time staff name: ");
        sc.nextLine();
        String ptName = sc.nextLine();
        System.out.print("Enter part-time staff address: ");
        String ptAddress = sc.nextLine();
        System.out.print("Enter part-time staff hours: ");
        double ptHours = sc.nextDouble();
        System.out.print("Enter part-time staff rate: ");
        double ptRate = sc.nextDouble();

        PartTimeStaff partTimeStaff = new PartTimeStaff(ptName, ptAddress, ptHours, ptRate);
        partTimeStaff.displayDetails();
        }
        else
        System.out.print("Wrong option selected");
    }
}
