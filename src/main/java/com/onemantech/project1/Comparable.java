/*
Certainly! To implement `Comparable` for the `Employee1` class based on salary, you can do the following:

        ```java
        import java.util.*;

class Employee1 implements Comparable<Employee1> {
    private String name;
    private int id;
    private String city;
    private int age;
    private int salary;

    public Employee1(String name, int id, String city, int age, int salary) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee1 otherEmployee) {
        return Integer.compare(this.salary, otherEmployee.salary);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee1> salaryList = Arrays.asList(
                new Employee1("Vijay", 1260004, "Bangalore", 29, 5000),
                new Employee1("Revathi", 1260009, "Chennai", 29, 50000),
                new Employee1("Ajay", 1260001, "Bangalore", 21, 1000),
                new Employee1("Vijay", 1260010, "Chennai", 48, 4560),
                new Employee1("Revathi", 1260089, "Delhi", 49, 7890)
        );

        // Using Comparable with compareTo method
        Collections.sort(salaryList);
        salaryList.forEach(System.out::println);
    }
}
```

        In this example:

        1. The `Employee1` class implements the `Comparable` interface, and we override the `compareTo` method to compare employees based on their salary.

        2. We create a list of `Employee1` objects and use `Collections.sort` to sort them using the natural ordering defined by the `compareTo` method.

        3. Finally, we iterate through the sorted list and print the employees.

        This implementation allows you to sort `Employee1` objects based on their salary using the `compareTo` method defined in the `Comparable` interface.*/
