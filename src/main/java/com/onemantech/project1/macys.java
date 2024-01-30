package com.onemantech.project1;


import com.onemantech.dao.Address;
import com.onemantech.dao.Macys;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class macys {

  public static void main(String[] args) {

           /*  1. String Vijayaragavendran
              2. split into Char
              3. stream
              3. collect(Collectors.groupingBy((vijay->vijay),Collectors.counting())
              4.use map.getEntry() method to get the whole map values
              5.Filter (X->X.getValues >1)
              6.map
              7.(Map.Entry::entrySet)
              8.collect()Collectors.toMap())
      */


      String abc = "Vijayaragavendran";
      List<String> repeatNumber = Arrays.stream(abc.split(""))
              .collect((Collectors.groupingBy(Function.identity(),Collectors.counting())))
              .entrySet()
              .stream()
              .filter(X -> X.getValue() > 1)
              .map(Map.Entry::getKey).collect(Collectors.toList());
      repeatNumber.forEach(System.out::println);

       List<Macys> emplist = List.of(
               new Macys ("Vijay",123,List.of( "Chennai","mumbai","Banglore"),30,123456),
               new Macys ("Ajay",123,List.of ( "Chennai","mumbai","Kerala"),30,123456),
               new Macys ("Revathi",123,List.of( "Chennai","Kerala","Banglore"),30,123456));

        Set<Macys> xyz = emplist.stream().filter(X->X.getLocation().stream().anyMatch(locatio->locatio.equals("kerala"))).collect(Collectors.toSet());
//      Set<List<Macys>> xyz1 = emplist.stream().filter()
      xyz.stream().forEach(System.out::println);


 }
}
