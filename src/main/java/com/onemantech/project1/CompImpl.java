//package com.onemantech.project1;
//
//import com.onemantech.dao.Dao;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class CompImpl  {
//
//public static void main (String[] args)
//{
//
//    List<Dao> people = new ArrayList<>();
//    people.add(new Dao("Alice", 30));
//    people.add(new Dao("Bob", 25));
//    people.add(new Dao("Charlie", 35));
//
//    // Sort using Comparable (based on age)
//    Collections.sort(people);
//    System.out.println("Sorted by age (Comparable):");
//    for (Dao person : people) {
//        System.out.println(person);
//    }
//
//    Comparator<Dao> byName = Comparator.comparing(Dao::getName);
//    Collections.sort(people, byName);
//    System.out.println("\nSorted by name (Comparator):");
//    for (Dao person : people) {
//        System.out.println(person);
//    }
//}
//
//}
//
//
//}
