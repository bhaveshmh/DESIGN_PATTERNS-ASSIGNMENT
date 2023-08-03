package solid.srp;

public class Main {
    public static void main(String[] args) {
        int[] leaves = {1, 2};

        Employee emp = new Employee(124, 54000, "Bhavesh", "XYZ street", "Thane", "India", 12, leaves);
        Formatter EmployeeFormatter = new Formatter(emp);
        System.out.println(EmployeeFormatter.toHtml());
    }
}