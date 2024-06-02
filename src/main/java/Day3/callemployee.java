package Day3;

public class callemployee {
    public static void main(String[] args) {



            // Create a new Employee object
            employee x = new employee("BUSHRA", 12000, 2021);

            // Access the employee's information
            System.out.println("Name: " +x.getName());
            System.out.println("Salary" + x.getSalary() + " per month");
            System.out.println("Hire Year " + x.getHireYear());
            System.out.println("Annual Salary" + x.getAnnualSalary());
            System.out.println("Service Period " + x.getServicePeriod() + " years");
        }

}
