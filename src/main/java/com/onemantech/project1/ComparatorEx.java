package com.onemantech.project1;

import com.onemantech.dao.Employee;
import com.onemantech.dao.Employee1;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.apache.coyote.http11.Constants.a;

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

    String vijay = "vijayaragavendran";

    List<String> namelst = Arrays.asList("Vijayaragavendran", "Revathi", "Ramakrishnan","Ajay");


    Map<String, Long> sortedlist = Arrays.stream(vijay.split("")).collect(Collectors.groupingBy((Function.identity()),Collectors.counting()));
    int n = 2;
    Optional<Employee1> emp =
        salaryList.stream()
            .sorted(Comparator.comparingInt(Employee1::getSalary).reversed())
            .distinct()
            .skip(1)
            .findFirst();
    System.out.println(emp);




    // Hash Map

      HashMap<Integer,String> mp = new HashMap<>();
      mp.put(1,"vijay");
      mp.put(2,"Ajay");

      Set<Map.Entry<Integer,String>> entry = mp.entrySet();

      for (Map.Entry ent :entry)
      {
      System.out.println(ent.getKey()+" "+ent.getValue());
    }

      List<Employee> lst = new ArrayList<Employee>();

      lst.add(new Employee ("Vijay",123,"Chennai", 30));
      lst.add(new Employee ("Revathi",345,"Chennai", 27));

      HashMap<Integer,String> mpp =lst.stream().collect(Collectors.toMap(Employee::getId,Employee::getName,(x,y)->x+","+y,LinkedHashMap::new));

    mpp.forEach((x, y) -> System.out.println(x + "value" + y +"value"));


  List <Employee1> employee1List = Arrays.asList(
          new Employee1 ("Vijay", 12345, "Chennai",30,150000),
          new Employee1 ("Ajay", 12347, "Chennai",27,80000),
          new Employee1 ("Revathi", 12348, "Chennai",25,60000),
          new Employee1 ("Tommy", 12349, "Chennai",3,1500000)
  );

      Optional<Employee1> empexl =
              salaryList.stream()
                      .sorted(Comparator.comparingInt(Employee1::getSalary).reversed())
                      .distinct()
                      .skip(1)
                      .findFirst();
      System.out.println(empexl);
     Optional<Employee1> salary= employee1List.stream().sorted(Comparator.comparingInt(Employee1::getSalary).reversed()).skip(1).findFirst();

     if (salary.isPresent())
     {
         Employee1 employee1 = salary.get();
      System.out.println(employee1);
     }
    System.out.println(salary+"os employeee");


 }
}
