package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

    static List<Employee> employees = new ArrayList<>();
    static  {
        employees.add( new Employee(
                "Dhanush",
                "Kumar",
                23400,
                List.of("Auth Service", "Payment Service")
        ));

        new Employee(
                "Arun",
                "Raj",
                5000,
                List.of("Inventory Service", "Order Service")
        );

        employees.add(
                new Employee(
                        "Priya",
                        "Sharma",
                        7500,
                       List.of("Reporting Service", "Analytics")
                )
        );
    }

    public static void main(String[] args) {

        // print
        employees.stream()
                .forEach(employee -> System.out.println(employee));

        // map
        employees.stream()
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 2,
                        employee.getProject()
                ))
                .collect(Collectors.toList());
    }

}

class Employee {

    private String firstName;
    private String lastName;
    private int salary;
    private List<String> project;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int salary, List<String> project) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                ", project=" + project +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }
}
