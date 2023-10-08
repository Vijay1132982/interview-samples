package com.onemantech.project1;

import com.onemantech.dao.Employee;
import com.onemantech.dao.Employee1;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorEx {

  public static void main(String[] args) {

    List<Employee> employeeList =
        Arrays.asList(
            new Employee("Vijay", 1260004, "Banglore", 29),
            new Employee("Revathi", 1260009, "Chennai", 29),
            new Employee("Ajay", 1260001, "Banglore", 21),
            new Employee("Vijay", 1260010, "Chennai", 48),
            new Employee("Revathi", 1260089, "Delhi", 49));

    Collections.sort(
        employeeList,
        (a, b) -> {
          int compareAge = Integer.compare(a.getAge(), b.getAge());
          if (compareAge != 0) {
            return compareAge;
          } else {
            return a.getName().compareTo(b.getName());
          }
        });

    System.out.println(employeeList);

    // Employee salary

    List<Employee1> salaryList =
        Arrays.asList(
            new Employee1("Vijay", 1260004, "Banglore", 29, 5000),
            new Employee1("Revathi", 1260009, "Chennai", 29, 50000),
            new Employee1("Ajay", 1260001, "Banglore", 21, 1000),
            new Employee1("Vijay", 1260010, "Chennai", 48, 4560),
            new Employee1("Revathi", 1260089, "Delhi", 49, 7890));
    // 50000,7890,5000 nth salary

    int n = 2;
    Optional<Employee1> emp =
        salaryList.stream()
            .sorted(Comparator.comparingInt(Employee1::getSalary).reversed())
            .distinct()
            .skip(1)
            .findFirst();
    System.out.println(emp);
  }
}

/*//comparator
Collections.sort(salaryList);
    System.out.println("Students sorted by ID (Comparable):");
    students.forEach(System.out::println);
Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    Collections.sort(students, nameComparator);
    System.out.println("\nStudents sorted by Name (Comparator):");
    students.forEach(System.out::println);*/
