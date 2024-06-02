package Day3;

import java.time.Year;
public class employee {
    // Instance variables
    public String name;
    public double salary;
    public int hireYear;

    public employee() {

        name = " unknown";
        salary = 0;
        hireYear= 0;
    }

    // Constructor
    public employee(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    // Method to get the annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }

    // Method to calculate the service period
    public int getServicePeriod() {
        int currentYear = Year.now().getValue();
        return currentYear - hireYear;
    }
}




