package com.onemantech.project1;

import com.onemantech.dao.Employee;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {

  public static void main(String[] args) {

    // No of occurances of characters

    String test = "onemantechsolutions";
    Map<String, Long> mp =
        Arrays.stream(test.split(""))
            .collect(Collectors.groupingBy((Function.identity()), Collectors.counting()));
    System.out.println(mp);

    // No of occurances of String

    List<String> str = Arrays.asList("Vijay", "Revathi", "Vijay", "Ajay", "Revathi", "Revathi");
    Map<String, Long> stroc =
        str.stream().collect(Collectors.groupingBy((Function.identity()), Collectors.counting()));
    System.out.println(stroc);

    // Find the duplicate characters on string
    String test2 = "onemantechsolutions";
    List<String> duplicateElements =
        Arrays.stream(test2.split(""))
            .collect(Collectors.groupingBy((Function.identity()), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(x -> x.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    String test3 = "vijayaragavendran";

    List<Employee> emplst2 =
        Arrays.asList(
            new Employee("VIjay", 12345, "chennai", 24), new Employee("Ajay", 56789, "mumbai", 35));

    Map<Integer, String> emplistgh =
        emplst2.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

    for (Map.Entry<Integer, String> obj : emplistgh.entrySet()) {
      System.out.println(obj.getKey() + "value");
      System.out.println(obj.getValue() + "Key");
    }
  }
}
