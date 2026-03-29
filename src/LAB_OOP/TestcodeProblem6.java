package LAB_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

abstract class Employee implements Comparable<Employee> {
    protected String employeeId;
    protected String employeeName;
    protected double salaryPerHour;
    protected int noOfLeavingDay;
    protected int noOfTravelDay;

    public Employee(String employeeId, String employeeName, double salaryPerHour,
                    int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public double calculateBaseWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2.0);
    }

    public abstract double calculateWeeklySalary();
    public abstract String getRole();

    @Override
    public int compareTo(Employee other) {
        // Rule 1: salary
        int cmp = Double.compare(other.calculateWeeklySalary(), this.calculateWeeklySalary());
        if (cmp != 0) return cmp;

        // Rule 2: travel day
        cmp = Integer.compare(other.noOfTravelDay, this.noOfTravelDay);
        if (cmp != 0) return cmp;

        // Rule 3: leaving day (ít hơn tốt hơn)
        cmp = Integer.compare(this.noOfLeavingDay, other.noOfLeavingDay);
        if (cmp != 0) return cmp;

        // Rule 4: name
        return this.employeeName.compareTo(other.employeeName);
    }

    @Override
    public String toString() {
        return "[" + getRole() + "] ID: " + employeeId +
                ", Name: " + employeeName +
                ", Weekly Salary: " + calculateWeeklySalary();
    }
}
 class OfficeEmployee extends Employee {
    private double overtimeHours;

    public OfficeEmployee(String id, String name, double salaryPerHour,
                          int leave, int travel, double overtimeHours) {
        super(id, name, salaryPerHour, leave, travel);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateWeeklySalary() {
        return calculateBaseWeeklySalary() + overtimeHours * salaryPerHour * 1.5;
    }

    @Override
    public String getRole() {
        return "Office";
    }
}
class TravelEmployee extends Employee {
    private double allowancePerTravelDay;

    public TravelEmployee(String id, String name, double salaryPerHour,
                          int leave, int travel, double allowance) {
        super(id, name, salaryPerHour, leave, travel);
        this.allowancePerTravelDay = allowance;
    }

    @Override
    public double calculateWeeklySalary() {
        return calculateBaseWeeklySalary() + noOfTravelDay * allowancePerTravelDay;
    }

    @Override
    public String getRole() {
        return "Travel";
    }
}

class Project {
    private String projectId;
    private String projectName;
    private double budgetLimit;
    private ArrayList<Employee> employees;

    public Project(String id, String name, double budgetLimit) {
        this.projectId = id;
        this.projectName = name;
        this.budgetLimit = budgetLimit;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        for (Employee emp : employees) {
            if (emp.employeeId.equals(e.employeeId)) {
                System.out.println("Duplicate ID! Reject: " + e.employeeId);
                return;
            }
        }
        employees.add(e);
    }

    public boolean removeEmployee(String id) {
        return employees.removeIf(e -> e.employeeId.equals(id));
    }

    public double estimateWeeklyBudget() {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.calculateWeeklySalary();
        }
        return sum;
    }

    public Employee highestPaidEmployee() {
        return Collections.max(employees);
    }

    public int countOfficeEmployees() {
        int count = 0;
        for (Employee e : employees) {
            if (e instanceof OfficeEmployee) count++;
        }
        return count;
    }

    public int countTravelEmployees() {
        int count = 0;
        for (Employee e : employees) {
            if (e instanceof TravelEmployee) count++;
        }
        return count;
    }

    public boolean isOverBudget() {
        return estimateWeeklyBudget() > budgetLimit;
    }

    @Override
    public String toString() {
        Collections.sort(employees);

        StringBuilder sb = new StringBuilder();
        sb.append("Project: ").append(projectName).append("\n");

        for (Employee e : employees) {
            sb.append(e).append("\n");
        }

        sb.append("Total Budget: ").append(estimateWeeklyBudget()).append("\n");
        sb.append("Over Budget? ").append(isOverBudget()).append("\n");
        sb.append("Highest Paid: ").append(highestPaidEmployee()).append("\n");

        return sb.toString();
    }
}
public class TestcodeProblem6 {
        public static void main(String[] args) {
            Project p = new Project("P01", "AI Project", 5000);

            Employee e1 = new OfficeEmployee("E01", "Alice", 20, 1, 0, 10);
            Employee e2 = new TravelEmployee("E02", "Bob", 18, 0, 3, 50);
            Employee e3 = new OfficeEmployee("E03", "Charlie", 22, 0, 1, 5);
            Employee e4 = new TravelEmployee("E04", "David", 25, 1, 2, 60);
            Employee e5 = new OfficeEmployee("E05", "Eve", 19, 2, 0, 8);

            // Add employees
            p.addEmployee(e1);
            p.addEmployee(e2);
            p.addEmployee(e3);
            p.addEmployee(e4);
            p.addEmployee(e5);

            // Duplicate test
            p.addEmployee(new OfficeEmployee("E01", "Fake", 10, 0, 0, 0));

            // Print project
            System.out.println(p);

            // Update
            ((OfficeEmployee) e1).salaryPerHour = 30;

            System.out.println("After update:");
            System.out.println(p);
        }

}
