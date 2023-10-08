package com.onemantech.project1;

import com.onemantech.dao.Employee;
import org.apache.logging.log4j.util.Chars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {

  public static void main(String[] args) {

      // No of occurances of characters

      String test = "onemantechsolutions";
      Map<String,Long> mp= Arrays.stream(test.split("")).collect(Collectors.groupingBy((Function.identity()),Collectors.counting()));
      System.out.println(mp);

      // No of occurances of String

     List<String> str = Arrays.asList("Vijay","Revathi","Vijay","Ajay","Revathi","Revathi");
     Map<String,Long> stroc = str.stream().collect(
             Collectors.groupingBy(
                     (Function.identity()),Collectors.counting()));
      System.out.println(stroc);

      // Find the duplicate characters on string
      String test2 = "onemantechsolutions";
      List<String> strr=Arrays.stream(test2.split("")).collect(
              Collectors.groupingBy(
                      (Function.identity()),Collectors.counting()))
              .entrySet()
              .stream()
              .filter(x->x.getValue()>1)
              .map(Map.Entry::getKey).collect(Collectors.toList());

         System.out.println(strr);
  }
}
