package class17;

public class EmpTester {
    public static void main(String[] args) {
        Employee josh=new Employee("Josh", "IT",
                1200, 25) ;
        josh.printSalary();
        josh.calculatePrintTax();
    }

}
